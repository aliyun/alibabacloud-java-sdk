// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddAssetSelectionCriteriaRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The conditions for searching assets. This parameter is in JSON format. Pay attention to the letter case when you specify this parameter.</p>
     * <blockquote>
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. Call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;LogicalExp&quot;:&quot;AND&quot;,&quot;Criteria&quot;:&quot;[{\&quot;name\&quot;:\&quot;osType\&quot;,\&quot;value\&quot;:\&quot;linux\&quot;,\&quot;logicalExp\&quot;:\&quot;AND\&quot;},{\&quot;name\&quot;:\&quot;alarmStatus\&quot;,\&quot;value\&quot;:\&quot;YES\&quot;,\&quot;logicalExp\&quot;:\&quot;AND\&quot;}]&quot;}</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The operation type for criteria. Valid values:</p>
     * <ul>
     * <li><strong>add</strong>: adds assets.</li>
     * <li><strong>del</strong>: deletes assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("CriteriaOperation")
    public String criteriaOperation;

    /**
     * <p>The unique identifier of the asset selection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5196d280-5bfa-496a-ba70-8a3935e3****</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    /**
     * <p>The list of assets.</p>
     */
    @NameInMap("TargetOperationList")
    public java.util.List<AddAssetSelectionCriteriaRequestTargetOperationList> targetOperationList;

    public static AddAssetSelectionCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAssetSelectionCriteriaRequest self = new AddAssetSelectionCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public AddAssetSelectionCriteriaRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddAssetSelectionCriteriaRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public AddAssetSelectionCriteriaRequest setCriteriaOperation(String criteriaOperation) {
        this.criteriaOperation = criteriaOperation;
        return this;
    }
    public String getCriteriaOperation() {
        return this.criteriaOperation;
    }

    public AddAssetSelectionCriteriaRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public AddAssetSelectionCriteriaRequest setTargetOperationList(java.util.List<AddAssetSelectionCriteriaRequestTargetOperationList> targetOperationList) {
        this.targetOperationList = targetOperationList;
        return this;
    }
    public java.util.List<AddAssetSelectionCriteriaRequestTargetOperationList> getTargetOperationList() {
        return this.targetOperationList;
    }

    public static class AddAssetSelectionCriteriaRequestTargetOperationList extends TeaModel {
        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: adds the asset.</li>
         * <li><strong>del</strong>: deletes the asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>del</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The asset ID. If you select assets by machine, the value is the UUID of the machine. If you select assets by group, the value is the group ID. If you select assets by VPC, the value is the VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1188****</p>
         */
        @NameInMap("Target")
        public String target;

        public static AddAssetSelectionCriteriaRequestTargetOperationList build(java.util.Map<String, ?> map) throws Exception {
            AddAssetSelectionCriteriaRequestTargetOperationList self = new AddAssetSelectionCriteriaRequestTargetOperationList();
            return TeaModel.build(map, self);
        }

        public AddAssetSelectionCriteriaRequestTargetOperationList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public AddAssetSelectionCriteriaRequestTargetOperationList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

}
