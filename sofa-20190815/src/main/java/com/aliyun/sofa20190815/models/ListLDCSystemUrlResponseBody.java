// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCSystemUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UrlList")
    public java.util.List<ListLDCSystemUrlResponseBodyUrlList> urlList;

    public static ListLDCSystemUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCSystemUrlResponseBody self = new ListLDCSystemUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCSystemUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCSystemUrlResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCSystemUrlResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCSystemUrlResponseBody setUrlList(java.util.List<ListLDCSystemUrlResponseBodyUrlList> urlList) {
        this.urlList = urlList;
        return this;
    }
    public java.util.List<ListLDCSystemUrlResponseBodyUrlList> getUrlList() {
        return this.urlList;
    }

    public static class ListLDCSystemUrlResponseBodyUrlList extends TeaModel {
        @NameInMap("Context")
        public String context;

        @NameInMap("PlatformName")
        public String platformName;

        @NameInMap("Url")
        public String url;

        public static ListLDCSystemUrlResponseBodyUrlList build(java.util.Map<String, ?> map) throws Exception {
            ListLDCSystemUrlResponseBodyUrlList self = new ListLDCSystemUrlResponseBodyUrlList();
            return TeaModel.build(map, self);
        }

        public ListLDCSystemUrlResponseBodyUrlList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public ListLDCSystemUrlResponseBodyUrlList setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public ListLDCSystemUrlResponseBodyUrlList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
