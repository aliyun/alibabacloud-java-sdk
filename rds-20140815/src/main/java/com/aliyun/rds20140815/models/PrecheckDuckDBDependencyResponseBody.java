// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PrecheckDuckDBDependencyResponseBody extends TeaModel {
    /**
     * <p>The items that do not meet the prerequisites for creating a DuckDB-based analytical instance.</p>
     */
    @NameInMap("FailedCheckItems")
    public java.util.List<PrecheckDuckDBDependencyResponseBodyFailedCheckItems> failedCheckItems;

    /**
     * <p>Indicates whether the prerequisite check for creating a DuckDB-based analytical instance is passed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The check is passed.</li>
     * <li><strong>false</strong>: The check is not passed.</li>
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
         * <p>Indicates whether the item can be fixed with one click.</p>
         * <ul>
         * <li><strong>true</strong>: The item can be fixed with one click by calling the <a href="https://help.aliyun.com/document_detail/2623684.html">ModifyDBInstanceConfig</a> operation.</li>
         * <li><strong>false</strong>: The item cannot be fixed with one click.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: If the major engine version of the database instance does not meet the requirements, you must perform a <a href="https://help.aliyun.com/document_detail/2623684.html">manual upgrade</a>.</p>
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
         * <p>The target value or target range of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>17.0</p>
         */
        @NameInMap("RequiredValue")
        public String requiredValue;

        /**
         * <p>The check item type. Valid values:</p>
         * <ul>
         * <li><strong>Parameter</strong>: parameter.</li>
         * <li><strong>MinorVersion</strong>: minor engine version.</li>
         * <li><strong>MajorVersion</strong>: major engine version.</li>
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
