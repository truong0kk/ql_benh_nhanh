create table patient(
	maBN varchar(10) primary key,
	hoTen Nvarchar(30),
	tenKhoa Nvarchar(40),
	diaChi Nvarchar(50),
	gioiTinh Nvarchar(10),
	sdt varchar(20),
	benh Nvarchar(50),
	ngayNhap date ,
	ngayXuat date,
	lichSuNhapVien varchar(8000)
)

insert into patient
values
('bn1', N'Phạm Thanh Bình', N'Xương khớp', N'Hải Phòng', N'Nam', '0344433452',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11'),
('bn2', N'Lê Thị Ánh', N'Ung bướu', N'Hà Nội', N'Nữ', '0324458741',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11'),
('bn3', N'Nguyễn Trung Sang', N'Dược', N'Hưng Yên', N'Nam', '0347557521',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11'),
('bn4', N'Nguyễn Thị Tuyết', N'Dược', N'Nam Định', N'Nữ', '0343522431',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11'),
('bn5', N'Nguyễn Thị Uyên', N'Điều dưỡng', N'Phú Thọ', N'Nữ', '0346445441',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11'),
('bn6', N'Nguyễn Thị Duyên', N'Thần kinh', N'Hà Nội', N'Nữ', '0342455644',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11'),
('bn7', N'Nguyễn Thị Vân', N'Khám bệnh', N'Bắc Ninh', N'Nữ', '0347556445',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11'),
('bn8', N'Nguyễn Quốc Tuấn', N'Tay chân miệng', N'Hải Dương', N'Nam', '0346467552',N'cảm cúm ','2021-10-10','2021-11-11','- ngay nhap vien : 2021-10-10  ngay xuat vien: 2021-11-11')