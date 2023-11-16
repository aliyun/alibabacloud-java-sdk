// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleApplicationResponseBody extends TeaModel {
    @NameInMap("ContainerWebDefenseAppList")
    public java.util.List<GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList> containerWebDefenseAppList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSasContainerWebDefenseRuleApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleApplicationResponseBody self = new GetSasContainerWebDefenseRuleApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleApplicationResponseBody setContainerWebDefenseAppList(java.util.List<GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList> containerWebDefenseAppList) {
        this.containerWebDefenseAppList = containerWebDefenseAppList;
        return this;
    }
    public java.util.List<GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList> getContainerWebDefenseAppList() {
        return this.containerWebDefenseAppList;
    }

    public GetSasContainerWebDefenseRuleApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Tag")
        public String tag;

        public static GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList build(java.util.Map<String, ?> map) throws Exception {
            GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList self = new GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList();
            return TeaModel.build(map, self);
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
