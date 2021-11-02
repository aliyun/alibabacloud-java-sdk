// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryDomainsResponseBody extends TeaModel {
    @NameInMap("Content")
    public ListVodRealtimeLogDeliveryDomainsResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVodRealtimeLogDeliveryDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryDomainsResponseBody self = new ListVodRealtimeLogDeliveryDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryDomainsResponseBody setContent(ListVodRealtimeLogDeliveryDomainsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVodRealtimeLogDeliveryDomainsResponseBodyContent getContent() {
        return this.content;
    }

    public ListVodRealtimeLogDeliveryDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Status")
        public String status;

        public static ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains build(java.util.Map<String, ?> map) throws Exception {
            ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains self = new ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains();
            return TeaModel.build(map, self);
        }

        public ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListVodRealtimeLogDeliveryDomainsResponseBodyContentDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
