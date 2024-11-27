// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListRegionZoneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public java.util.List<ListRegionZoneResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>IllegalRequest</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>438737AC-760A-57D9-B646-B7EF79426243</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRegionZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionZoneResponseBody self = new ListRegionZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionZoneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListRegionZoneResponseBody setData(java.util.List<ListRegionZoneResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRegionZoneResponseBodyData> getData() {
        return this.data;
    }

    public ListRegionZoneResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRegionZoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRegionZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRegionZoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRegionZoneResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>E</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>zone id</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListRegionZoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRegionZoneResponseBodyData self = new ListRegionZoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRegionZoneResponseBodyData setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListRegionZoneResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
