SELECT *
FROM Barang b
WHERE b.harga > 10000
ORDER BY b.harga;

SELECT *
FROM Pelanggan p
WHERE p.nama ILIKE '%g%' AND p.alamat = 'BANDUNG';

SELECT
    t.kode,
    t.tanggal,
    p.nama AS nama_pelanggan,
    b.nama AS nama_barang,
    t.jumlah_barang AS jumlah,
    b.harga AS harga_satuan,
    (t.jumlah_barang * b.harga) AS total
FROM Transaksi t
JOIN Pelanggan p ON t.kode_pelanggan = p.kode
JOIN Barang b ON t.kode_barang = b.kode
ORDER BY p.nama, t.tanggal;


SELECT
    p.nama,
    SUM(t.jumlah_barang) AS jumlah,
    SUM(t.jumlah_barang * b.harga) AS total_harga
FROM Transaksi t
JOIN Pelanggan p ON t.KODE_PELANGGAN = p.KODE
JOIN Barang b ON t.KODE_BARANG = b.KODE
GROUP BY p.nama
ORDER BY p.nama;
