package com.skylaker.yunzhi.pojo;

import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyong
 * Date: 2018/5/17
 * Time: 22:29
 * Description: 问题实体
 */
@Alias("question")
@Table(name = "QUESTION")
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;

    //问题主键ID
    @Id
    @Column(name = "qid")
    @GeneratedValue(generator = "JDBC")
    private int qid;

    //问题标题
    @Column
    private String title;

    //问题描述
    @Column
    private String text;

    //提问用户ID
    @Column
    private int userid;

    //创建时间
    @Column
    private Date createtime;

    //修改时间
    @Column
    private Date updatetime;


    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qid=" + qid +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", userid=" + userid +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }
}