// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescibeImportsFromDatabaseResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescibeImportsFromDatabaseResponseBodyItems items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ImportDataStatus")
        public String importDataStatus;

        @NameInMap("ImportDataStatusDescription")
        public String importDataStatusDescription;

        @NameInMap("ImportDataType")
        public String importDataType;

        @NameInMap("ImportId")
        public Integer importId;

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
