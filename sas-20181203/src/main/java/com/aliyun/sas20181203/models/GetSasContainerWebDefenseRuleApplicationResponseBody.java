// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleApplicationResponseBody extends TeaModel {
    /**
     * <p>The applications.</p>
     */
    @NameInMap("ContainerWebDefenseAppList")
    public java.util.List<GetSasContainerWebDefenseRuleApplicationResponseBodyContainerWebDefenseAppList> containerWebDefenseAppList;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The user ID.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the container cluster.</p>
         * <br>
         * <p>>  The IDs of clusters can be obtained by using the [DescribeGroupedContainerInstances](~~182997~~) operation.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the application was created. Unit: milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time. Unit: milliseconds.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The value of the application label.</p>
         */
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
