create table users(
	uusername varchar(30),
	upassword varchar(30)
)

create table staff(
	maNV varchar(10) primary key,
	hoTen nvarchar(30),
	tenKhoa nvarchar(50),
	diaChi nvarchar(30),
	gioiTinh nvarchar(5),
	sdt varchar(15)
)

insert into users
values
('quangDuong', '123456'),
('xuanTruong', '987654')

insert into staff
values
('nv1', N'Phạm Thanh Bình', N'Xương khớp', N'Hải Phòng', N'Nam', '0344433452'),
('nv2', N'Lê Thị Ánh', N'Ung bướu', N'Hà Nội', N'Nữ', '0324458741'),
('nv3', N'Nguyễn Trung Sang', N'Dược', N'Hưng Yên', N'Nam', '0347557521'),
('nv4', N'Nguyễn Thị Tuyết', N'Dược', N'Nam Định', N'Nữ', '0343522431'),
('nv5', N'Nguyễn Thị Uyên', N'Điều dưỡng', N'Phú Thọ', N'Nữ', '0346445441'),
('nv6', N'Nguyễn Thị Duyên', N'Thần kinh', N'Hà Nội', N'Nữ', '0342455644'),
('nv7', N'Nguyễn Thị Vân', N'Khám bệnh', N'Bắc Ninh', N'Nữ', '0347556445'),
('nv8', N'Nguyễn Quốc Tuấn', N'Tay chân miệng', N'Hải Dương', N'Nam', '0346467552')