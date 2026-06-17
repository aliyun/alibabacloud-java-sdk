// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SetPolarFsFileQuotaRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>An array of objects defining the file quota rules for specific directories.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FilePathQuotas")
    public java.util.List<SetPolarFsFileQuotaRequestFilePathQuotas> filePathQuotas;

    /**
     * <p>The ID of the PolarFS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static SetPolarFsFileQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolarFsFileQuotaRequest self = new SetPolarFsFileQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetPolarFsFileQuotaRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SetPolarFsFileQuotaRequest setFilePathQuotas(java.util.List<SetPolarFsFileQuotaRequestFilePathQuotas> filePathQuotas) {
        this.filePathQuotas = filePathQuotas;
        return this;
    }
    public java.util.List<SetPolarFsFileQuotaRequestFilePathQuotas> getFilePathQuotas() {
        return this.filePathQuotas;
    }

    public SetPolarFsFileQuotaRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static class SetPolarFsFileQuotaRequestFilePathQuotas extends TeaModel {
        /**
         * <p>The capacity quota in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The absolute path of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/a/project</p>
         */
        @NameInMap("FilePathId")
        public String filePathId;

        /**
         * <p>The inode quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Inodes")
        public Long inodes;

        /**
         * <p>The maximum depth of subdirectories to traverse under the path specified by <code>FilePathId</code>. A value of 1 traverses only the first level of subdirectories. A value of 0 traverses to the deepest level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxDepth")
        public Integer maxDepth;

        /**
         * <p>A list of file quota rule IDs, separated by a comma (<code>,</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        @NameInMap("QuotaIds")
        public String quotaIds;

        /**
         * <p>Specifies how to apply the rule to existing files. Valid values:</p>
         * <ul>
         * <li><p><strong>missing</strong>: Applies the rule only if one does not already exist. (Default)</p>
         * </li>
         * <li><p><strong>all</strong>: Applies the rule to all files.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>missing</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static SetPolarFsFileQuotaRequestFilePathQuotas build(java.util.Map<String, ?> map) throws Exception {
            SetPolarFsFileQuotaRequestFilePathQuotas self = new SetPolarFsFileQuotaRequestFilePathQuotas();
            return TeaModel.build(map, self);
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setFilePathId(String filePathId) {
            this.filePathId = filePathId;
            return this;
        }
        public String getFilePathId() {
            return this.filePathId;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setInodes(Long inodes) {
            this.inodes = inodes;
            return this;
        }
        public Long getInodes() {
            return this.inodes;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setMaxDepth(Integer maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }
        public Integer getMaxDepth() {
            return this.maxDepth;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setQuotaIds(String quotaIds) {
            this.quotaIds = quotaIds;
            return this;
        }
        public String getQuotaIds() {
            return this.quotaIds;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

}
