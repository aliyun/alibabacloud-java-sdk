// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListAvailableZonesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListAvailableZonesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableZonesResponseBody self = new ListAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableZonesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAvailableZonesResponseBody setData(java.util.List<ListAvailableZonesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAvailableZonesResponseBodyData> getData() {
        return this.data;
    }

    public ListAvailableZonesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAvailableZonesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAvailableZonesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAvailableZonesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableZonesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAvailableZonesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao-b</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        /**
         * <strong>example:</strong>
         * <p>ha-cn-t9b30w902vm_qrs</p>
         */
        @NameInMap("zoneName")
        public String zoneName;

        public static ListAvailableZonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableZonesResponseBodyData self = new ListAvailableZonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvailableZonesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAvailableZonesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAvailableZonesResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListAvailableZonesResponseBodyData setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
