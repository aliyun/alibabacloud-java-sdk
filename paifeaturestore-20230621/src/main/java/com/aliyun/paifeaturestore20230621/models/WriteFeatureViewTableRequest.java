// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteFeatureViewTableRequest extends TeaModel {
    /**
     * <p>The write mode.</p>
     * <ul>
     * <li><p>Overwrite: Overwrites existing data.</p>
     * </li>
     * <li><p>Merge: Merges the new data with existing data.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Merge</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The partitions to write to.</p>
     */
    @NameInMap("Partitions")
    public java.util.Map<String, java.util.Map<String, ?>> partitions;

    /**
     * <p>The file data source.</p>
     */
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
         * <p>The file delimiter.</p>
         * 
         * <strong>example:</strong>
         * <p>,</p>
         */
        @NameInMap("Delimiter")
        public String delimiter;

        /**
         * <p>Specifies whether to omit the header from the source file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OmitHeader")
        public Boolean omitHeader;

        /**
         * <p>The data source path.</p>
         * 
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
