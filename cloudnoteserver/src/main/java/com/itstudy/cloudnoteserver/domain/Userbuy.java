package com.itstudy.cloudnoteserver.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Userbuy implements Serializable{
	private String userid;
	private int fileid;

}
