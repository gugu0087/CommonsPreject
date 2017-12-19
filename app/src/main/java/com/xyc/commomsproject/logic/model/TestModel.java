package com.xyc.commomsproject.logic.model;

/**
 * Created by hasee on 2017/12/18.
 */

public class TestModel {
    private String createTime;
    private String creatorId;
    private String id;
    private String lastUpdateTime;
    private String publishTime;
    private String scaleId;
    private String status;
    private String taskDetail;
    private String type;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getScaleId() {
        return scaleId;
    }

    public void setScaleId(String scaleId) {
        this.scaleId = scaleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "createTime='" + createTime + '\'' +
                ", creatorId='" + creatorId + '\'' +
                ", id='" + id + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", scaleId='" + scaleId + '\'' +
                ", status='" + status + '\'' +
                ", taskDetail='" + taskDetail + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
