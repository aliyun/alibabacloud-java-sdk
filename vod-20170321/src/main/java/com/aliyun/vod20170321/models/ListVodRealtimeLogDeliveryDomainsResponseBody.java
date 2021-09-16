// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryDomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public ListVodRealtimeLogDeliveryDomainsResponseBodyContent content;

    public static ListVodRealtimeLogDeliveryDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryDomainsResponseBody self = new ListVodRealtimeLogDeliveryDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVodRealtimeLogDeliveryDomainsResponseBody setContent(ListVodRealtimeLogDeliveryDomainsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVodRealtimeLogDeliveryDomainsResponseBodyContent getContent() {
        return this.content;
    }

    public static class ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DomainName")
        public String domainName;

        public static ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains build(java.util.Map<String, ?> map) throws Exception {
            ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains self = new ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains();
            return TeaModel.build(map, self);
        }

        public ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class ListVodRealtimeLogDeliveryDomainsResponseBodyContent extends TeaModel {
        @NameInMap("Domains")
        public java.util.List<ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains> domains;

        public static ListVodRealtimeLogDeliveryDomainsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVodRealtimeLogDeliveryDomainsResponseBodyContent self = new ListVodRealtimeLogDeliveryDomainsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVodRealtimeLogDeliveryDomainsResponseBodyContent setDomains(java.util.List<ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains> getDomains() {
            return this.domains;
        }

    }

}
