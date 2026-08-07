// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListCloneVoicesResponseBody extends TeaModel {
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
    public ListCloneVoicesResponseBodyData data;

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
     * <p>Instance does not exist. Instance=anchashi.</p>
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

    public static ListCloneVoicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoicesResponseBody self = new ListCloneVoicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloneVoicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCloneVoicesResponseBody setData(ListCloneVoicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCloneVoicesResponseBodyData getData() {
        return this.data;
    }

    public ListCloneVoicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCloneVoicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloneVoicesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCloneVoicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloneVoicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloneVoicesResponseBodyDataCloneVoices extends TeaModel {
        /**
         * <p>克隆音色ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
         */
        @NameInMap("CloneVoiceId")
        public String cloneVoiceId;

        /**
         * <p>创建时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>模型名称</p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>名称</p>
         * 
         * <strong>example:</strong>
         * <p>测试克隆音</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>目前支持IFLYTEK、VOLC</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>状态</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>租户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1308144684576765</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>更新时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>音色</p>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v3-flash-voicebot2-8aa485413eba42089c873eec1f901d64</p>
         */
        @NameInMap("Voice")
        public String voice;

        public static ListCloneVoicesResponseBodyDataCloneVoices build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoicesResponseBodyDataCloneVoices self = new ListCloneVoicesResponseBodyDataCloneVoices();
            return TeaModel.build(map, self);
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setCloneVoiceId(String cloneVoiceId) {
            this.cloneVoiceId = cloneVoiceId;
            return this;
        }
        public String getCloneVoiceId() {
            return this.cloneVoiceId;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public ListCloneVoicesResponseBodyDataCloneVoices setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class ListCloneVoicesResponseBodyData extends TeaModel {
        /**
         * <p>数据列表</p>
         */
        @NameInMap("CloneVoices")
        public java.util.List<ListCloneVoicesResponseBodyDataCloneVoices> cloneVoices;

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
         * <p>符合条件的记录总数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCloneVoicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoicesResponseBodyData self = new ListCloneVoicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloneVoicesResponseBodyData setCloneVoices(java.util.List<ListCloneVoicesResponseBodyDataCloneVoices> cloneVoices) {
            this.cloneVoices = cloneVoices;
            return this;
        }
        public java.util.List<ListCloneVoicesResponseBodyDataCloneVoices> getCloneVoices() {
            return this.cloneVoices;
        }

        public ListCloneVoicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCloneVoicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloneVoicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
