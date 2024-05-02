package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 退出拼团
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
@TableName("tuichupintuan")
public class TuichupintuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TuichupintuanEntity() {
		
	}
	
	public TuichupintuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商铺编号
	 */
					
	private String shangpubianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商品类型
	 */
					
	private String shangpinleixing;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 商品数量
	 */
					
	private Integer shangpinshuliang;
	
	/**
	 * 拼团人数
	 */
					
	private Integer pintuanrenshu;
	
	/**
	 * 退出时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tuichushijian;
	
	/**
	 * 退出原因
	 */
					
	private String tuichuyuanyin;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商铺编号
	 */
	public void setShangpubianhao(String shangpubianhao) {
		this.shangpubianhao = shangpubianhao;
	}
	/**
	 * 获取：商铺编号
	 */
	public String getShangpubianhao() {
		return shangpubianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：商品类型
	 */
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：商品数量
	 */
	public void setShangpinshuliang(Integer shangpinshuliang) {
		this.shangpinshuliang = shangpinshuliang;
	}
	/**
	 * 获取：商品数量
	 */
	public Integer getShangpinshuliang() {
		return shangpinshuliang;
	}
	/**
	 * 设置：拼团人数
	 */
	public void setPintuanrenshu(Integer pintuanrenshu) {
		this.pintuanrenshu = pintuanrenshu;
	}
	/**
	 * 获取：拼团人数
	 */
	public Integer getPintuanrenshu() {
		return pintuanrenshu;
	}
	/**
	 * 设置：退出时间
	 */
	public void setTuichushijian(Date tuichushijian) {
		this.tuichushijian = tuichushijian;
	}
	/**
	 * 获取：退出时间
	 */
	public Date getTuichushijian() {
		return tuichushijian;
	}
	/**
	 * 设置：退出原因
	 */
	public void setTuichuyuanyin(String tuichuyuanyin) {
		this.tuichuyuanyin = tuichuyuanyin;
	}
	/**
	 * 获取：退出原因
	 */
	public String getTuichuyuanyin() {
		return tuichuyuanyin;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
