// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodRealtimeLogDeliveryInfosResponseBody extends TeaModel {
    @NameInMap("Content")
    public ListVodRealtimeLogDeliveryInfosResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVodRealtimeLogDeliveryInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodRealtimeLogDeliveryInfosResponseBody self = new ListVodRealtimeLogDeliveryInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodRealtimeLogDeliveryInfosResponseBody setContent(ListVodRealtimeLogDeliveryInfosResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVodRealtimeLogDeliveryInfosResponseBodyContent getContent() {
        return this.content;
    }

    public ListVodRealtimeLogDeliveryInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos extends TeaModel {
        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("Project")
        public String project;

        @NameInMap("Region")
        public String region;

        public static ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos self = new ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class ListVodRealtimeLogDeliveryInfosResponseBodyContent extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfos")
        public java.util.List<ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos;

        public static ListVodRealtimeLogDeliveryInfosResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVodRealtimeLogDeliveryInfosResponseBodyContent self = new ListVodRealtimeLogDeliveryInfosResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVodRealtimeLogDeliveryInfosResponseBodyContent setRealtimeLogDeliveryInfos(java.util.List<ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos) {
            this.realtimeLogDeliveryInfos = realtimeLogDeliveryInfos;
            return this;
        }
        public java.util.List<ListVodRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> getRealtimeLogDeliveryInfos() {
            return this.realtimeLogDeliveryInfos;
        }

    }

}
