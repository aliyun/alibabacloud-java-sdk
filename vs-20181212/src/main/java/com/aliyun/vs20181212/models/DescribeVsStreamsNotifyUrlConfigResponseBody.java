// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamsNotifyConfig")
    public DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig liveStreamsNotifyConfig;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsStreamsNotifyUrlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsNotifyUrlConfigResponseBody self = new DescribeVsStreamsNotifyUrlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsNotifyUrlConfigResponseBody setLiveStreamsNotifyConfig(DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig liveStreamsNotifyConfig) {
        this.liveStreamsNotifyConfig = liveStreamsNotifyConfig;
        return this;
    }
    public DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig getLiveStreamsNotifyConfig() {
        return this.liveStreamsNotifyConfig;
    }

    public DescribeVsStreamsNotifyUrlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig extends TeaModel {
        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("AuthType")
        public String authType;

        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("NotifyUrl")
        public String notifyUrl;

        public static DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig self = new DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

    }

}
