// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("TotalPageCount")
    @Validation(required = true)
    public Integer totalPageCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeCrossBackupMetaListResponseItems items;

    public static DescribeCrossBackupMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossBackupMetaListResponse self = new DescribeCrossBackupMetaListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCrossBackupMetaListResponseItemsMeta extends TeaModel {
        @NameInMap("Database")
        @Validation(required = true)
        public String database;

        @NameInMap("Tables")
        @Validation(required = true)
        public String tables;

        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        public static DescribeCrossBackupMetaListResponseItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossBackupMetaListResponseItemsMeta self = new DescribeCrossBackupMetaListResponseItemsMeta();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCrossBackupMetaListResponseItems extends TeaModel {
        @NameInMap("Meta")
        @Validation(required = true)
        public java.util.List<DescribeCrossBackupMetaListResponseItemsMeta> meta;

        public static DescribeCrossBackupMetaListResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossBackupMetaListResponseItems self = new DescribeCrossBackupMetaListResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
