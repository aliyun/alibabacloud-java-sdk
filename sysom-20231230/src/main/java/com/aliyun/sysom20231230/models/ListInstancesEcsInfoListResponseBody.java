// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesEcsInfoListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.InvalidParameter</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListInstancesEcsInfoListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    public static ListInstancesEcsInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesEcsInfoListResponseBody self = new ListInstancesEcsInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesEcsInfoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesEcsInfoListResponseBody setData(java.util.List<ListInstancesEcsInfoListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstancesEcsInfoListResponseBodyData> getData() {
        return this.data;
    }

    public ListInstancesEcsInfoListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class ListInstancesEcsInfoListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11.193.52.91</p>
         */
        @NameInMap("ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>sysom</p>
         */
        @NameInMap("tag_key")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>diagnosis</p>
         */
        @NameInMap("tag_value")
        public String tagValue;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("type")
        public String type;

        public static ListInstancesEcsInfoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesEcsInfoListResponseBodyData self = new ListInstancesEcsInfoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesEcsInfoListResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListInstancesEcsInfoListResponseBodyData setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListInstancesEcsInfoListResponseBodyData setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListInstancesEcsInfoListResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
