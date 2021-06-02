// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisListSceneInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 返回集合
    @NameInMap("List")
    public java.util.List<StatisListSceneInfoResponseBodyList> list;

    // 页码
    @NameInMap("PageNum")
    public Integer pageNum;

    // 一页显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 总数
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 总页数
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static StatisListSceneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StatisListSceneInfoResponseBody self = new StatisListSceneInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public StatisListSceneInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StatisListSceneInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public StatisListSceneInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StatisListSceneInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StatisListSceneInfoResponseBody setList(java.util.List<StatisListSceneInfoResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<StatisListSceneInfoResponseBodyList> getList() {
        return this.list;
    }

    public StatisListSceneInfoResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public StatisListSceneInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public StatisListSceneInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public StatisListSceneInfoResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class StatisListSceneInfoResponseBodyList extends TeaModel {
        // 0：默认类型(增加type字段时默认值) 1：3D模型 2：全景图片3：全景视频
        @NameInMap("SceneType")
        public Integer sceneType;

        // 发布时间到秒
        @NameInMap("PublishTime")
        public String publishTime;

        // 主场景名称
        @NameInMap("SceneName")
        public String sceneName;

        // 资源数量
        @NameInMap("ResCount")
        public Integer resCount;

        // 项目名称
        @NameInMap("ProjectName")
        public String projectName;

        // 计费量
        @NameInMap("MeasureCount")
        public Integer measureCount;

        // statustinyin是否已发布 0:未发布 1：已发布
        @NameInMap("PublishStatus")
        public Long publishStatus;

        // 主场景创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 主场景id
        @NameInMap("SceneId")
        public Long sceneId;

        // 项目Id
        @NameInMap("ProjectId")
        public Long projectId;

        public static StatisListSceneInfoResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            StatisListSceneInfoResponseBodyList self = new StatisListSceneInfoResponseBodyList();
            return TeaModel.build(map, self);
        }

        public StatisListSceneInfoResponseBodyList setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

        public StatisListSceneInfoResponseBodyList setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public StatisListSceneInfoResponseBodyList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public StatisListSceneInfoResponseBodyList setResCount(Integer resCount) {
            this.resCount = resCount;
            return this;
        }
        public Integer getResCount() {
            return this.resCount;
        }

        public StatisListSceneInfoResponseBodyList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public StatisListSceneInfoResponseBodyList setMeasureCount(Integer measureCount) {
            this.measureCount = measureCount;
            return this;
        }
        public Integer getMeasureCount() {
            return this.measureCount;
        }

        public StatisListSceneInfoResponseBodyList setPublishStatus(Long publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public Long getPublishStatus() {
            return this.publishStatus;
        }

        public StatisListSceneInfoResponseBodyList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public StatisListSceneInfoResponseBodyList setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public StatisListSceneInfoResponseBodyList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
