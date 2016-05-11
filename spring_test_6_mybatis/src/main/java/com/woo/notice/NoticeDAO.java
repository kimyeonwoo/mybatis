package com.woo.notice;

import java.util.List;

public interface NoticeDAO {
	public List<NoticeDTO> board(int startnum, int lastnum);
	public NoticeDTO boardView(int num);
	public int boardWrite(NoticeDTO noticeDTO);
	public int totalpage();
}
