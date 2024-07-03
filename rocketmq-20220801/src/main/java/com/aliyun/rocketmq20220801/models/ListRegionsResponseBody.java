// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MissingPageNumber</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListRegionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ConsumerGroupId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>instanceId</p>
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
     * <p>0B962390-D84B-5D44-8C11-79DF40299D41</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRegionsResponseBody setData(java.util.List<ListRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRegionsResponseBodyData> getData() {
        return this.data;
    }

    public ListRegionsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListRegionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListRegionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRegionsResponseBodyDataTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("tagCode")
        public String tagCode;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("tagValue")
        public Object tagValue;

        public static ListRegionsResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyDataTags self = new ListRegionsResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyDataTags setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListRegionsResponseBodyDataTags setTagValue(Object tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public Object getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListRegionsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        @NameInMap("regionName")
        public String regionName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportRocketmqV4")
        public Boolean supportRocketmqV4;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportRocketmqV5")
        public Boolean supportRocketmqV5;

        @NameInMap("tags")
        public java.util.List<ListRegionsResponseBodyDataTags> tags;

        /**
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyData self = new ListRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRegionsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRegionsResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListRegionsResponseBodyData setSupportRocketmqV4(Boolean supportRocketmqV4) {
            this.supportRocketmqV4 = supportRocketmqV4;
            return this;
        }
        public Boolean getSupportRocketmqV4() {
            return this.supportRocketmqV4;
        }

        public ListRegionsResponseBodyData setSupportRocketmqV5(Boolean supportRocketmqV5) {
            this.supportRocketmqV5 = supportRocketmqV5;
            return this;
        }
        public Boolean getSupportRocketmqV5() {
            return this.supportRocketmqV5;
        }

        public ListRegionsResponseBodyData setTags(java.util.List<ListRegionsResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListRegionsResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public ListRegionsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
