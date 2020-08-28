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

    }

    public static class DescibeImportsFromDatabaseResponseItems extends TeaModel {
        @NameInMap("ImportResultFromDB")
        @Validation(required = true)
        public java.util.List<DescibeImportsFromDatabaseResponseItemsImportResultFromDB> importResultFromDB;

        public static DescibeImportsFromDatabaseResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescibeImportsFromDatabaseResponseItems self = new DescibeImportsFromDatabaseResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
