// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PrecheckDuckDBDependencyResponseBody extends TeaModel {
    /**
     * <p>The check items that do not meet the requirements for creating DuckDB-based analytical instances.</p>
     */
    @NameInMap("FailedCheckItems")
    public java.util.List<PrecheckDuckDBDependencyResponseBodyFailedCheckItems> failedCheckItems;

    /**
     * <p>Indicates whether the primary instance meet the requirements for creating DuckDB-based analytical instances. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static PrecheckDuckDBDependencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckDuckDBDependencyResponseBody self = new PrecheckDuckDBDependencyResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckDuckDBDependencyResponseBody setFailedCheckItems(java.util.List<PrecheckDuckDBDependencyResponseBodyFailedCheckItems> failedCheckItems) {
        this.failedCheckItems = failedCheckItems;
        return this;
    }
    public java.util.List<PrecheckDuckDBDependencyResponseBodyFailedCheckItems> getFailedCheckItems() {
        return this.failedCheckItems;
    }

    public PrecheckDuckDBDependencyResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public static class PrecheckDuckDBDependencyResponseBodyFailedCheckItems extends TeaModel {
        /**
         * <p>Indicates whether the item can be changed with one click to meet the requirements.</p>
         * <ul>
         * <li><strong>true</strong>: Yes. You can call the <a href="https://help.aliyun.com/document_detail/2623684.html">ModifyDBInstanceConfig</a> operation to change the item with one click.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p> If the major engine version of the primary does not meet the requirements, you must manually upgrade it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowAutoModify")
        public Boolean allowAutoModify;

        /**
         * <p>The current value of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>15.0</p>
         */
        @NameInMap("CurrentValue")
        public String currentValue;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>MajorVersion</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value or value range that meets the requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>17.0</p>
         */
        @NameInMap("RequiredValue")
        public String requiredValue;

        /**
         * <p>The check item. Valid values:</p>
         * <ul>
         * <li><strong>Parameter</strong>: The parameters of the primary instance.</li>
         * <li><strong>MinorVersion</strong>: The minor engine version of the primary instance.</li>
         * <li><strong>MajorVersion</strong>: The major engine version of the primary instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Parameter</p>
         */
        @NameInMap("Type")
        public String type;

        public static PrecheckDuckDBDependencyResponseBodyFailedCheckItems build(java.util.Map<String, ?> map) throws Exception {
            PrecheckDuckDBDependencyResponseBodyFailedCheckItems self = new PrecheckDuckDBDependencyResponseBodyFailedCheckItems();
            return TeaModel.build(map, self);
        }

        public PrecheckDuckDBDependencyResponseBodyFailedCheckItems setAllowAutoModify(Boolean allowAutoModify) {
            this.allowAutoModify = allowAutoModify;
            return this;
        }
        public Boolean getAllowAutoModify() {
            return this.allowAutoModify;
        }

        public PrecheckDuckDBDependencyResponseBodyFailedCheckItems setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public String getCurrentValue() {
            return this.currentValue;
        }

        public PrecheckDuckDBDependencyResponseBodyFailedCheckItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PrecheckDuckDBDependencyResponseBodyFailedCheckItems setRequiredValue(String requiredValue) {
            this.requiredValue = requiredValue;
            return this;
        }
        public String getRequiredValue() {
            return this.requiredValue;
        }

        public PrecheckDuckDBDependencyResponseBodyFailedCheckItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
