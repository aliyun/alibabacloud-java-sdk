// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DataSourceItem extends TeaModel {
    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>data-20210114104214-xxxxxxx</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The data source type. Only File Storage NAS (NAS) file systems are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>nas</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The data source description.</p>
     * 
     * <strong>example:</strong>
     * <p>data source of dlc examples</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>nas-data</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The endpoint of the Alibaba Cloud OSS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-beijing-internal.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the NAS file system. For more information, see <a href="https://help.aliyun.com/document_detail/185212.html">Alibaba Cloud documentation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The time when the data source was created. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the data source was last modified. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:00Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>The local path of the container that is attached to the runtime of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/data/</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>The configuration options of the Alibaba Cloud OSS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The path of the Alibaba Cloud Object Storage Service (OSS) file system.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket/path/to/dir</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the Alibaba Cloud account that creates the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DataSourceItem build(java.util.Map<String, ?> map) throws Exception {
        DataSourceItem self = new DataSourceItem();
        return TeaModel.build(map, self);
    }

    public DataSourceItem setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DataSourceItem setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DataSourceItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataSourceItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DataSourceItem setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DataSourceItem setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DataSourceItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DataSourceItem setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public DataSourceItem setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public DataSourceItem setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public DataSourceItem setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DataSourceItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
