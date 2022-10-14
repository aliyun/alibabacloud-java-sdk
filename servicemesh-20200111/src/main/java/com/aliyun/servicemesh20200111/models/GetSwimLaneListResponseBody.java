// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SwimLaneList")
    public java.util.List<GetSwimLaneListResponseBodySwimLaneList> swimLaneList;

    public static GetSwimLaneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneListResponseBody self = new GetSwimLaneListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwimLaneListResponseBody setSwimLaneList(java.util.List<GetSwimLaneListResponseBodySwimLaneList> swimLaneList) {
        this.swimLaneList = swimLaneList;
        return this;
    }
    public java.util.List<GetSwimLaneListResponseBodySwimLaneList> getSwimLaneList() {
        return this.swimLaneList;
    }

    public static class GetSwimLaneListResponseBodySwimLaneList extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IngressRule")
        public String ingressRule;

        @NameInMap("IngressService")
        public String ingressService;

        @NameInMap("LabelSelectorKey")
        public String labelSelectorKey;

        @NameInMap("LabelSelectorValue")
        public String labelSelectorValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("ServiceList")
        public String serviceList;

        public static GetSwimLaneListResponseBodySwimLaneList build(java.util.Map<String, ?> map) throws Exception {
            GetSwimLaneListResponseBodySwimLaneList self = new GetSwimLaneListResponseBodySwimLaneList();
            return TeaModel.build(map, self);
        }

        public GetSwimLaneListResponseBodySwimLaneList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetSwimLaneListResponseBodySwimLaneList setIngressRule(String ingressRule) {
            this.ingressRule = ingressRule;
            return this;
        }
        public String getIngressRule() {
            return this.ingressRule;
        }

        public GetSwimLaneListResponseBodySwimLaneList setIngressService(String ingressService) {
            this.ingressService = ingressService;
            return this;
        }
        public String getIngressService() {
            return this.ingressService;
        }

        public GetSwimLaneListResponseBodySwimLaneList setLabelSelectorKey(String labelSelectorKey) {
            this.labelSelectorKey = labelSelectorKey;
            return this;
        }
        public String getLabelSelectorKey() {
            return this.labelSelectorKey;
        }

        public GetSwimLaneListResponseBodySwimLaneList setLabelSelectorValue(String labelSelectorValue) {
            this.labelSelectorValue = labelSelectorValue;
            return this;
        }
        public String getLabelSelectorValue() {
            return this.labelSelectorValue;
        }

        public GetSwimLaneListResponseBodySwimLaneList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSwimLaneListResponseBodySwimLaneList setServiceList(String serviceList) {
            this.serviceList = serviceList;
            return this;
        }
        public String getServiceList() {
            return this.serviceList;
        }

    }

}
