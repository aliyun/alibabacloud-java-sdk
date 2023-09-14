// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescibeImportsFromDatabaseResponseBody extends TeaModel {
    /**
     * <p>An array that consists of migration tasks.</p>
     */
    @NameInMap("Items")
    public DescibeImportsFromDatabaseResponseBodyItems items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescibeImportsFromDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescibeImportsFromDatabaseResponseBody self = new DescibeImportsFromDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescibeImportsFromDatabaseResponseBody setItems(DescibeImportsFromDatabaseResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescibeImportsFromDatabaseResponseBodyItems getItems() {
        return this.items;
    }

    public DescibeImportsFromDatabaseResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescibeImportsFromDatabaseResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescibeImportsFromDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescibeImportsFromDatabaseResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB extends TeaModel {
        /**
         * <p>The status of the migration task. Valid values:</p>
         * <br>
         * <p>*   **NotStart**: The migration task has not started.</p>
         * <p>*   **FullExporting**: The migration task is exporting full data.</p>
         * <p>*   **FullImporting**: The migration task is importing full data.</p>
         * <p>*   **Success**: The migration task is successful.</p>
         * <p>*   **Failed**: The migration task fails.</p>
         * <p>*   **Canceled**: The migration task is canceled.</p>
         * <p>*   **Canceling**: The migration task is being canceled.</p>
         * <p>*   **IncrementalWaiting**: The migration task is waiting to synchronize incremental data.</p>
         * <p>*   **IncrementalImporting**: The migration task is synchronizing incremental data.</p>
         * <p>*   **StopSyncing**: The migration task stops synchronizing data.</p>
         */
        @NameInMap("ImportDataStatus")
        public String importDataStatus;

        /**
         * <p>The description of the migration task.</p>
         */
        @NameInMap("ImportDataStatusDescription")
        public String importDataStatusDescription;

        /**
         * <p>The type of the migration task. Valid values:</p>
         * <br>
         * <p>*   **Full**: full migration</p>
         * <p>*   **Incremental:**: incremental migration</p>
         */
        @NameInMap("ImportDataType")
        public String importDataType;

        /**
         * <p>The ID of the migration task.</p>
         */
        @NameInMap("ImportId")
        public Integer importId;

        /**
         * <p>The time when the migration task synchronized incremental data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("IncrementalImportingTime")
        public String incrementalImportingTime;

        public static DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB build(java.util.Map<String, ?> map) throws Exception {
            DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB self = new DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB();
            return TeaModel.build(map, self);
        }

        public DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB setImportDataStatus(String importDataStatus) {
            this.importDataStatus = importDataStatus;
            return this;
        }
        public String getImportDataStatus() {
            return this.importDataStatus;
        }

        public DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB setImportDataStatusDescription(String importDataStatusDescription) {
            this.importDataStatusDescription = importDataStatusDescription;
            return this;
        }
        public String getImportDataStatusDescription() {
            return this.importDataStatusDescription;
        }

        public DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB setImportDataType(String importDataType) {
            this.importDataType = importDataType;
            return this;
        }
        public String getImportDataType() {
            return this.importDataType;
        }

        public DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB setImportId(Integer importId) {
            this.importId = importId;
            return this;
        }
        public Integer getImportId() {
            return this.importId;
        }

        public DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB setIncrementalImportingTime(String incrementalImportingTime) {
            this.incrementalImportingTime = incrementalImportingTime;
            return this;
        }
        public String getIncrementalImportingTime() {
            return this.incrementalImportingTime;
        }

    }

    public static class DescibeImportsFromDatabaseResponseBodyItems extends TeaModel {
        @NameInMap("ImportResultFromDB")
        public java.util.List<DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB> importResultFromDB;

        public static DescibeImportsFromDatabaseResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescibeImportsFromDatabaseResponseBodyItems self = new DescibeImportsFromDatabaseResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescibeImportsFromDatabaseResponseBodyItems setImportResultFromDB(java.util.List<DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB> importResultFromDB) {
            this.importResultFromDB = importResultFromDB;
            return this;
        }
        public java.util.List<DescibeImportsFromDatabaseResponseBodyItemsImportResultFromDB> getImportResultFromDB() {
            return this.importResultFromDB;
        }

    }

}
