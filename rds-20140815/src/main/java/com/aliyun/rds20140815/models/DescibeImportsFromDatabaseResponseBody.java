// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescibeImportsFromDatabaseResponseBody extends TeaModel {
    /**
     * <p>The migration tasks.</p>
     */
    @NameInMap("Items")
    public DescibeImportsFromDatabaseResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B000AA91-393D-46F9-8D9B-098E28931A3A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li><strong>NotStart</strong>: The migration task has not started.</li>
         * <li><strong>FullExporting</strong>: The migration task is exporting full data.</li>
         * <li><strong>FullImporting</strong>: The migration task is importing full data.</li>
         * <li><strong>Success</strong>: The migration task is successful.</li>
         * <li><strong>Failed</strong>: The migration task failed.</li>
         * <li><strong>Canceled</strong>: The migration task is canceled.</li>
         * <li><strong>Canceling</strong>: The migration task is being canceled.</li>
         * <li><strong>IncrementalWaiting</strong>: The migration task is waiting to synchronize incremental data.</li>
         * <li><strong>IncrementalImporting</strong>: The migration task is synchronizing incremental data.</li>
         * <li><strong>StopSyncing</strong>: The migration task stops synchronizing data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotStart</p>
         */
        @NameInMap("ImportDataStatus")
        public String importDataStatus;

        /**
         * <p>The description of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("ImportDataStatusDescription")
        public String importDataStatusDescription;

        /**
         * <p>The type of the migration task. Valid values:</p>
         * <ul>
         * <li><strong>Full</strong>: full migration</li>
         * <li><strong>Incremental:</strong>: incremental migration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Full</p>
         */
        @NameInMap("ImportDataType")
        public String importDataType;

        /**
         * <p>The ID of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ImportId")
        public Integer importId;

        /**
         * <p>The time when the migration task synchronized incremental data. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-06-11T15:00Z</p>
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
