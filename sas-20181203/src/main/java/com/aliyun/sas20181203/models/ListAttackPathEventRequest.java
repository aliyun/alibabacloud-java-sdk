// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackPathEventRequest extends TeaModel {
    /**
     * <p>The list of cloud service assets in the attack path.</p>
     */
    @NameInMap("AttackPathAssetList")
    public java.util.List<ListAttackPathEventRequestAttackPathAssetList> attackPathAssetList;

    /**
     * <p>The page number of the results to return. Default value: 1, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time as a timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1668064495000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The path name description.</p>
     * <blockquote>
     * <p>Call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query path name descriptions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS Instance Can Obtain Long-term Access Credential by Enabling Console Logon for RAM User</p>
     */
    @NameInMap("PathNameDesc")
    public String pathNameDesc;

    /**
     * <p>The path type.</p>
     * <blockquote>
     * <p>Call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query path types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>role_escalation</p>
     */
    @NameInMap("PathType")
    public String pathType;

    /**
     * <p>The list of risk levels.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>The start time as a timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1666886400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAttackPathEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAttackPathEventRequest self = new ListAttackPathEventRequest();
        return TeaModel.build(map, self);
    }

    public ListAttackPathEventRequest setAttackPathAssetList(java.util.List<ListAttackPathEventRequestAttackPathAssetList> attackPathAssetList) {
        this.attackPathAssetList = attackPathAssetList;
        return this;
    }
    public java.util.List<ListAttackPathEventRequestAttackPathAssetList> getAttackPathAssetList() {
        return this.attackPathAssetList;
    }

    public ListAttackPathEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAttackPathEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAttackPathEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAttackPathEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAttackPathEventRequest setPathNameDesc(String pathNameDesc) {
        this.pathNameDesc = pathNameDesc;
        return this;
    }
    public String getPathNameDesc() {
        return this.pathNameDesc;
    }

    public ListAttackPathEventRequest setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }
    public String getPathType() {
        return this.pathType;
    }

    public ListAttackPathEventRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    public ListAttackPathEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class ListAttackPathEventRequestAttackPathAssetList extends TeaModel {
        /**
         * <p>The subtype of the cloud service asset.</p>
         * <blockquote>
         * <p>Call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the subtypes of cloud service assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud service asset.</p>
         * <blockquote>
         * <p>Call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the types of cloud service assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>start</strong>: start node.</li>
         * <li><strong>end</strong>: end node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The vendor of the cloud service asset.</p>
         * <blockquote>
         * <p>Call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the vendors of cloud service assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListAttackPathEventRequestAttackPathAssetList build(java.util.Map<String, ?> map) throws Exception {
            ListAttackPathEventRequestAttackPathAssetList self = new ListAttackPathEventRequestAttackPathAssetList();
            return TeaModel.build(map, self);
        }

        public ListAttackPathEventRequestAttackPathAssetList setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListAttackPathEventRequestAttackPathAssetList setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListAttackPathEventRequestAttackPathAssetList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListAttackPathEventRequestAttackPathAssetList setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
