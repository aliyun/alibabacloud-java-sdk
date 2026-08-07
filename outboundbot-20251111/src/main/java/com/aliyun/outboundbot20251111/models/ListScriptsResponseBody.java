// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListScriptsResponseBody extends TeaModel {
    /**
     * <p>返回码</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据</p>
     */
    @NameInMap("Data")
    public ListScriptsResponseBodyData data;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>错误信息</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=ob-0987654321</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>错误信息中的变量值列表</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsResponseBody self = new ListScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptsResponseBody setData(ListScriptsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListScriptsResponseBodyData getData() {
        return this.data;
    }

    public ListScriptsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScriptsResponseBodyDataScripts extends TeaModel {
        /**
         * <p>并发数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>创建时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>描述</p>
         * 
         * <strong>example:</strong>
         * <p>询问用户对本次服务是否满意</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>草稿版本ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b60</p>
         */
        @NameInMap("DraftVersionId")
        public String draftVersionId;

        /**
         * <p>名称</p>
         * 
         * <strong>example:</strong>
         * <p>满意度调研</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>NLU接入类型</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <p>NLU引擎类型</p>
         * 
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>电话号码</p>
         * 
         * <strong>example:</strong>
         * <p>01057316547</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>已发布版本ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b41</p>
         */
        @NameInMap("PublishedVersionId")
        public String publishedVersionId;

        /**
         * <p>场景ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>状态</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>更新时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListScriptsResponseBodyDataScripts build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsResponseBodyDataScripts self = new ListScriptsResponseBodyDataScripts();
            return TeaModel.build(map, self);
        }

        public ListScriptsResponseBodyDataScripts setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public ListScriptsResponseBodyDataScripts setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListScriptsResponseBodyDataScripts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScriptsResponseBodyDataScripts setDraftVersionId(String draftVersionId) {
            this.draftVersionId = draftVersionId;
            return this;
        }
        public String getDraftVersionId() {
            return this.draftVersionId;
        }

        public ListScriptsResponseBodyDataScripts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScriptsResponseBodyDataScripts setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public ListScriptsResponseBodyDataScripts setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public ListScriptsResponseBodyDataScripts setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListScriptsResponseBodyDataScripts setPublishedVersionId(String publishedVersionId) {
            this.publishedVersionId = publishedVersionId;
            return this;
        }
        public String getPublishedVersionId() {
            return this.publishedVersionId;
        }

        public ListScriptsResponseBodyDataScripts setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListScriptsResponseBodyDataScripts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListScriptsResponseBodyDataScripts setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListScriptsResponseBodyData extends TeaModel {
        /**
         * <p>页码，从1开始</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>每页记录数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>数据列表</p>
         */
        @NameInMap("Scripts")
        public java.util.List<ListScriptsResponseBodyDataScripts> scripts;

        /**
         * <p>符合条件的记录总数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListScriptsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsResponseBodyData self = new ListScriptsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListScriptsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListScriptsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScriptsResponseBodyData setScripts(java.util.List<ListScriptsResponseBodyDataScripts> scripts) {
            this.scripts = scripts;
            return this;
        }
        public java.util.List<ListScriptsResponseBodyDataScripts> getScripts() {
            return this.scripts;
        }

        public ListScriptsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
