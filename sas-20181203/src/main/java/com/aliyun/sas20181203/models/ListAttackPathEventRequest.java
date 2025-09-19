// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackPathEventRequest extends TeaModel {
    /**
     * <p>List of cloud product assets in the attack path.</p>
     */
    @NameInMap("AttackPathAssetList")
    public java.util.List<ListAttackPathEventRequestAttackPathAssetList> attackPathAssetList;

    /**
     * <p>Specifies from which page of the returned results the query results should be displayed. The default value is 1, indicating that the display starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Timestamp of the end time. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1668064495000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Sets the language type for requests and received messages, with the default being <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of data entries displayed per page in a paginated query. The default value is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Description of the path name.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path name description.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS Instance Can Obtain Long-term Access Credential by Enabling Console Logon for RAM User</p>
     */
    @NameInMap("PathNameDesc")
    public String pathNameDesc;

    /**
     * <p>Path type.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>role_escalation</p>
     */
    @NameInMap("PathType")
    public String pathType;

    /**
     * <p>List of risk level information.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>Timestamp of the start time. Unit: milliseconds.</p>
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
         * <p>Subtype of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the subtype of the cloud product asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>Type of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the type of the cloud product asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Node type, values:</p>
         * <ul>
         * <li><strong>start</strong>: start point.</li>
         * <li><strong>end</strong>: end point.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>Vendor of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the vendor of the cloud product asset.</p>
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
