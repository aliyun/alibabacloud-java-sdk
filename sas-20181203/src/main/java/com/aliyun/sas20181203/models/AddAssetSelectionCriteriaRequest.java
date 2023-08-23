// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddAssetSelectionCriteriaRequest extends TeaModel {
    /**
     * <p>The search conditions that are used to query assets. The value of this parameter is in the JSON format and is case-sensitive.</p>
     * <br>
     * <p>> A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The type of the operation on search conditions. Valid values:</p>
     * <br>
     * <p>*   **add**: adds assets.</p>
     * <p>*   **del**: deletes assets.</p>
     */
    @NameInMap("CriteriaOperation")
    public String criteriaOperation;

    /**
     * <p>The unique ID of the asset.</p>
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
         * <p>The type of the operation. Valid values:</p>
         * <br>
         * <p>*   **add**</p>
         * <p>*   **del**</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The ID of the asset.</p>
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
