// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescibeImportsFromDatabaseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescibeImportsFromDatabaseResponseItems items;

    public static DescibeImportsFromDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescibeImportsFromDatabaseResponse self = new DescibeImportsFromDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DescibeImportsFromDatabaseResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescibeImportsFromDatabaseResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescibeImportsFromDatabaseResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescibeImportsFromDatabaseResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescibeImportsFromDatabaseResponse setItems(DescibeImportsFromDatabaseResponseItems items) {
        this.items = items;
        return this;
    }
    public DescibeImportsFromDatabaseResponseItems getItems() {
        return this.items;
    }

    public static class DescibeImportsFromDatabaseResponseItemsImportResultFromDB extends TeaModel {
        @NameInMap("ImportId")
        @Validation(required = true)
        public Integer importId;

        @NameInMap("ImportDataType")
        @Validation(required = true)
        public String importDataType;

        @NameInMap("ImportDataStatus")
        @Validation(required = true)
        public String importDataStatus;

        @NameInMap("ImportDataStatusDescription")
        @Validation(required = true)
        public String importDataStatusDescription;

        @NameInMap("IncrementalImportingTime")
        @Validation(required = true)
        public String incrementalImportingTime;

        public static DescibeImportsFromDatabaseResponseItemsImportResultFromDB build(java.util.Map<String, ?> map) throws Exception {
            DescibeImportsFromDatabaseResponseItemsImportResultFromDB self = new DescibeImportsFromDatabaseResponseItemsImportResultFromDB();
            return TeaModel.build(map, self);
        }

        public DescibeImportsFromDatabaseResponseItemsImportResultFromDB setImportId(Integer importId) {
            this.importId = importId;
            return this;
        }
        public Integer getImportId() {
            return this.importId;
        }

        public DescibeImportsFromDatabaseResponseItemsImportResultFromDB setImportDataType(String importDataType) {
            this.importDataType = importDataType;
            return this;
        }
        public String getImportDataType() {
            return this.importDataType;
        }

        public DescibeImportsFromDatabaseResponseItemsImportResultFromDB setImportDataStatus(String importDataStatus) {
            this.importDataStatus = importDataStatus;
            return this;
        }
        public String getImportDataStatus() {
            return this.importDataStatus;
        }

        public DescibeImportsFromDatabaseResponseItemsImportResultFromDB setImportDataStatusDescription(String importDataStatusDescription) {
            this.importDataStatusDescription = importDataStatusDescription;
            return this;
        }
        public String getImportDataStatusDescription() {
            return this.importDataStatusDescription;
        }

        public DescibeImportsFromDatabaseResponseItemsImportResultFromDB setIncrementalImportingTime(String incrementalImportingTime) {
            this.incrementalImportingTime = incrementalImportingTime;
            return this;
        }
        public String getIncrementalImportingTime() {
            return this.incrementalImportingTime;
        }

    }

    public static class DescibeImportsFromDatabaseResponseItems extends TeaModel {
        @NameInMap("ImportResultFromDB")
        @Validation(required = true)
        public java.util.List<DescibeImportsFromDatabaseResponseItemsImportResultFromDB> importResultFromDB;

        public static DescibeImportsFromDatabaseResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescibeImportsFromDatabaseResponseItems self = new DescibeImportsFromDatabaseResponseItems();
            return TeaModel.build(map, self);
        }

        public DescibeImportsFromDatabaseResponseItems setImportResultFromDB(java.util.List<DescibeImportsFromDatabaseResponseItemsImportResultFromDB> importResultFromDB) {
            this.importResultFromDB = importResultFromDB;
            return this;
        }
        public java.util.List<DescibeImportsFromDatabaseResponseItemsImportResultFromDB> getImportResultFromDB() {
            return this.importResultFromDB;
        }

    }

}
