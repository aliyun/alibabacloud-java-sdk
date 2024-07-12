// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteFeatureViewTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Merge</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("Partitions")
    public java.util.Map<String, java.util.Map<String, ?>> partitions;

    @NameInMap("UrlDatasource")
    public WriteFeatureViewTableRequestUrlDatasource urlDatasource;

    public static WriteFeatureViewTableRequest build(java.util.Map<String, ?> map) throws Exception {
        WriteFeatureViewTableRequest self = new WriteFeatureViewTableRequest();
        return TeaModel.build(map, self);
    }

    public WriteFeatureViewTableRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public WriteFeatureViewTableRequest setPartitions(java.util.Map<String, java.util.Map<String, ?>> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getPartitions() {
        return this.partitions;
    }

    public WriteFeatureViewTableRequest setUrlDatasource(WriteFeatureViewTableRequestUrlDatasource urlDatasource) {
        this.urlDatasource = urlDatasource;
        return this;
    }
    public WriteFeatureViewTableRequestUrlDatasource getUrlDatasource() {
        return this.urlDatasource;
    }

    public static class WriteFeatureViewTableRequestUrlDatasource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>,</p>
         */
        @NameInMap("Delimiter")
        public String delimiter;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OmitHeader")
        public Boolean omitHeader;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.com/file.csv</p>
         */
        @NameInMap("Path")
        public String path;

        public static WriteFeatureViewTableRequestUrlDatasource build(java.util.Map<String, ?> map) throws Exception {
            WriteFeatureViewTableRequestUrlDatasource self = new WriteFeatureViewTableRequestUrlDatasource();
            return TeaModel.build(map, self);
        }

        public WriteFeatureViewTableRequestUrlDatasource setDelimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public String getDelimiter() {
            return this.delimiter;
        }

        public WriteFeatureViewTableRequestUrlDatasource setOmitHeader(Boolean omitHeader) {
            this.omitHeader = omitHeader;
            return this;
        }
        public Boolean getOmitHeader() {
            return this.omitHeader;
        }

        public WriteFeatureViewTableRequestUrlDatasource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
