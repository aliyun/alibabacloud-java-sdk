// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreCheckItemsRequest extends TeaModel {
    /**
     * <p>The information about check items.</p>
     */
    @NameInMap("CheckAndRiskTypeList")
    public java.util.List<IgnoreCheckItemsRequestCheckAndRiskTypeList> checkAndRiskTypeList;

    /**
     * <p>The IDs of check items.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>List of container names that need to be whitelisted.</p>
     */
    @NameInMap("ContainerItems")
    public java.util.List<IgnoreCheckItemsRequestContainerItems> containerItems;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The reason why you add the risk item to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>already config in another way</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The data source. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: host baseline</li>
     * <li><strong>agentless</strong>: agentless baseline</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The operation that you want to perform on the risk item.Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: adds the risk item to the whitelist</li>
     * <li><strong>2</strong>: removes the risk item from the whitelist</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>The UUIDs of the servers.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static IgnoreCheckItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreCheckItemsRequest self = new IgnoreCheckItemsRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreCheckItemsRequest setCheckAndRiskTypeList(java.util.List<IgnoreCheckItemsRequestCheckAndRiskTypeList> checkAndRiskTypeList) {
        this.checkAndRiskTypeList = checkAndRiskTypeList;
        return this;
    }
    public java.util.List<IgnoreCheckItemsRequestCheckAndRiskTypeList> getCheckAndRiskTypeList() {
        return this.checkAndRiskTypeList;
    }

    public IgnoreCheckItemsRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public IgnoreCheckItemsRequest setContainerItems(java.util.List<IgnoreCheckItemsRequestContainerItems> containerItems) {
        this.containerItems = containerItems;
        return this;
    }
    public java.util.List<IgnoreCheckItemsRequestContainerItems> getContainerItems() {
        return this.containerItems;
    }

    public IgnoreCheckItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public IgnoreCheckItemsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreCheckItemsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public IgnoreCheckItemsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public IgnoreCheckItemsRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static class IgnoreCheckItemsRequestCheckAndRiskTypeList extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>52</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The baseline type of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>weak_password</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        public static IgnoreCheckItemsRequestCheckAndRiskTypeList build(java.util.Map<String, ?> map) throws Exception {
            IgnoreCheckItemsRequestCheckAndRiskTypeList self = new IgnoreCheckItemsRequestCheckAndRiskTypeList();
            return TeaModel.build(map, self);
        }

        public IgnoreCheckItemsRequestCheckAndRiskTypeList setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public IgnoreCheckItemsRequestCheckAndRiskTypeList setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

    }

    public static class IgnoreCheckItemsRequestContainerItems extends TeaModel {
        /**
         * <p>The names of the containers that need to be whitelisted for the current asset, separated by English commas.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;anythingllm,ChuanhuChat&quot;</p>
         */
        @NameInMap("ContainerNames")
        public String containerNames;

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>14eb2fb6-ab02-4869-a1e1-2cdb0f7*****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static IgnoreCheckItemsRequestContainerItems build(java.util.Map<String, ?> map) throws Exception {
            IgnoreCheckItemsRequestContainerItems self = new IgnoreCheckItemsRequestContainerItems();
            return TeaModel.build(map, self);
        }

        public IgnoreCheckItemsRequestContainerItems setContainerNames(String containerNames) {
            this.containerNames = containerNames;
            return this;
        }
        public String getContainerNames() {
            return this.containerNames;
        }

        public IgnoreCheckItemsRequestContainerItems setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
