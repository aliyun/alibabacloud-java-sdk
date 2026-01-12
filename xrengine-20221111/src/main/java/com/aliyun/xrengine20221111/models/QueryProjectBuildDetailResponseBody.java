// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryProjectBuildDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryProjectBuildDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryProjectBuildDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectBuildDetailResponseBody self = new QueryProjectBuildDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectBuildDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProjectBuildDetailResponseBody setData(QueryProjectBuildDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProjectBuildDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryProjectBuildDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProjectBuildDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectBuildDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Params")
        public String params;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TemplateId")
        public Long templateId;

        public static QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList self = new QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList();
            return TeaModel.build(map, self);
        }

        public QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryProjectBuildDetailResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceDetailResponseList")
        public java.util.List<QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList> instanceDetailResponseList;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserId")
        public Long userId;

        public static QueryProjectBuildDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectBuildDetailResponseBodyData self = new QueryProjectBuildDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectBuildDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryProjectBuildDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryProjectBuildDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryProjectBuildDetailResponseBodyData setInstanceDetailResponseList(java.util.List<QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList> instanceDetailResponseList) {
            this.instanceDetailResponseList = instanceDetailResponseList;
            return this;
        }
        public java.util.List<QueryProjectBuildDetailResponseBodyDataInstanceDetailResponseList> getInstanceDetailResponseList() {
            return this.instanceDetailResponseList;
        }

        public QueryProjectBuildDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryProjectBuildDetailResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryProjectBuildDetailResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
