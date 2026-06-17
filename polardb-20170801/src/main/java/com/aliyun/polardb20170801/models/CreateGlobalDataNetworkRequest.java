// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDataNetworkRequest extends TeaModel {
    /**
     * <p>The description or remarks for the GDN.</p>
     * 
     * <strong>example:</strong>
     * <p>mygdn</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Destination path</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("DestinationFileSystemPath")
    public String destinationFileSystemPath;

    /**
     * <p>Target PolarFileSystem (PolarFS) instance</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("DestinationId")
    public String destinationId;

    /**
     * <p>The region of the destination PolarFS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <p>The type of the destination instance. Valid values:</p>
     * <ul>
     * <li><p><strong>pfs</strong>: PolarFS High-Performance Edition.</p>
     * </li>
     * <li><p><strong>pcs</strong>: PolarFS Cold Storage Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pfs</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>Whether to freeze the source path during transmission. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Freeze.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not freeze.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Currently only supports oss source.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FreezeSourceDuringSync")
    public String freezeSourceDuringSync;

    /**
     * <p>The source path.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("SourceFileSystemPath")
    public String sourceFileSystemPath;

    /**
     * <p>Source PolarFileSystem (PolarFS) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-xxx</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The region of the source PolarFS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <ul>
     * <li><p><strong>pfs</strong>: PolarFS High-Performance Edition.</p>
     * </li>
     * <li><p><strong>pcs</strong>: PolarFS Cold Storage Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pcs</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static CreateGlobalDataNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDataNetworkRequest self = new CreateGlobalDataNetworkRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDataNetworkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGlobalDataNetworkRequest setDestinationFileSystemPath(String destinationFileSystemPath) {
        this.destinationFileSystemPath = destinationFileSystemPath;
        return this;
    }
    public String getDestinationFileSystemPath() {
        return this.destinationFileSystemPath;
    }

    public CreateGlobalDataNetworkRequest setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public String getDestinationId() {
        return this.destinationId;
    }

    public CreateGlobalDataNetworkRequest setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    public CreateGlobalDataNetworkRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateGlobalDataNetworkRequest setFreezeSourceDuringSync(String freezeSourceDuringSync) {
        this.freezeSourceDuringSync = freezeSourceDuringSync;
        return this;
    }
    public String getFreezeSourceDuringSync() {
        return this.freezeSourceDuringSync;
    }

    public CreateGlobalDataNetworkRequest setSourceFileSystemPath(String sourceFileSystemPath) {
        this.sourceFileSystemPath = sourceFileSystemPath;
        return this;
    }
    public String getSourceFileSystemPath() {
        return this.sourceFileSystemPath;
    }

    public CreateGlobalDataNetworkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateGlobalDataNetworkRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CreateGlobalDataNetworkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
