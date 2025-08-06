// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetStorageNotifyConfigResponseBody extends TeaModel {
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("OssNotifyConfig")
    public GetStorageNotifyConfigResponseBodyOssNotifyConfig ossNotifyConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetStorageNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageNotifyConfigResponseBody self = new GetStorageNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageNotifyConfigResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetStorageNotifyConfigResponseBody setOssNotifyConfig(GetStorageNotifyConfigResponseBodyOssNotifyConfig ossNotifyConfig) {
        this.ossNotifyConfig = ossNotifyConfig;
        return this;
    }
    public GetStorageNotifyConfigResponseBodyOssNotifyConfig getOssNotifyConfig() {
        return this.ossNotifyConfig;
    }

    public GetStorageNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetStorageNotifyConfigResponseBodyOssNotifyConfig extends TeaModel {
        @NameInMap("EventList")
        public String eventList;

        @NameInMap("HttpProcessAddress")
        public String httpProcessAddress;

        @NameInMap("NotifyName")
        public String notifyName;

        @NameInMap("ResourcePrefixName")
        public String resourcePrefixName;

        public static GetStorageNotifyConfigResponseBodyOssNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStorageNotifyConfigResponseBodyOssNotifyConfig self = new GetStorageNotifyConfigResponseBodyOssNotifyConfig();
            return TeaModel.build(map, self);
        }

        public GetStorageNotifyConfigResponseBodyOssNotifyConfig setEventList(String eventList) {
            this.eventList = eventList;
            return this;
        }
        public String getEventList() {
            return this.eventList;
        }

        public GetStorageNotifyConfigResponseBodyOssNotifyConfig setHttpProcessAddress(String httpProcessAddress) {
            this.httpProcessAddress = httpProcessAddress;
            return this;
        }
        public String getHttpProcessAddress() {
            return this.httpProcessAddress;
        }

        public GetStorageNotifyConfigResponseBodyOssNotifyConfig setNotifyName(String notifyName) {
            this.notifyName = notifyName;
            return this;
        }
        public String getNotifyName() {
            return this.notifyName;
        }

        public GetStorageNotifyConfigResponseBodyOssNotifyConfig setResourcePrefixName(String resourcePrefixName) {
            this.resourcePrefixName = resourcePrefixName;
            return this;
        }
        public String getResourcePrefixName() {
            return this.resourcePrefixName;
        }

    }

}
