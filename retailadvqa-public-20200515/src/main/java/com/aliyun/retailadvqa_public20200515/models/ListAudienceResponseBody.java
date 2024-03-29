// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListAudienceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListAudienceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ListAudienceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAudienceResponseBody self = new ListAudienceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAudienceResponseBody setData(ListAudienceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAudienceResponseBodyData getData() {
        return this.data;
    }

    public ListAudienceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAudienceResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListAudienceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAudienceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAudienceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListAudienceResponseBodyDataContent extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsDynamic")
        public Boolean isDynamic;

        @NameInMap("LatestDataModifyStatus")
        public String latestDataModifyStatus;

        @NameInMap("LatestDataModifyTime")
        public String latestDataModifyTime;

        @NameInMap("MappingTypes")
        public java.util.List<String> mappingTypes;

        @NameInMap("Name")
        public String name;

        @NameInMap("NumberOfAudiences")
        public String numberOfAudiences;

        public static ListAudienceResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListAudienceResponseBodyDataContent self = new ListAudienceResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListAudienceResponseBodyDataContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListAudienceResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAudienceResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAudienceResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAudienceResponseBodyDataContent setIsDynamic(Boolean isDynamic) {
            this.isDynamic = isDynamic;
            return this;
        }
        public Boolean getIsDynamic() {
            return this.isDynamic;
        }

        public ListAudienceResponseBodyDataContent setLatestDataModifyStatus(String latestDataModifyStatus) {
            this.latestDataModifyStatus = latestDataModifyStatus;
            return this;
        }
        public String getLatestDataModifyStatus() {
            return this.latestDataModifyStatus;
        }

        public ListAudienceResponseBodyDataContent setLatestDataModifyTime(String latestDataModifyTime) {
            this.latestDataModifyTime = latestDataModifyTime;
            return this;
        }
        public String getLatestDataModifyTime() {
            return this.latestDataModifyTime;
        }

        public ListAudienceResponseBodyDataContent setMappingTypes(java.util.List<String> mappingTypes) {
            this.mappingTypes = mappingTypes;
            return this;
        }
        public java.util.List<String> getMappingTypes() {
            return this.mappingTypes;
        }

        public ListAudienceResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAudienceResponseBodyDataContent setNumberOfAudiences(String numberOfAudiences) {
            this.numberOfAudiences = numberOfAudiences;
            return this;
        }
        public String getNumberOfAudiences() {
            return this.numberOfAudiences;
        }

    }

    public static class ListAudienceResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListAudienceResponseBodyDataContent> content;

        @NameInMap("PageNum")
        public String pageNum;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalNum")
        public String totalNum;

        public static ListAudienceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAudienceResponseBodyData self = new ListAudienceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAudienceResponseBodyData setContent(java.util.List<ListAudienceResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListAudienceResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListAudienceResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public ListAudienceResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListAudienceResponseBodyData setTotalNum(String totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public String getTotalNum() {
            return this.totalNum;
        }

    }

}
