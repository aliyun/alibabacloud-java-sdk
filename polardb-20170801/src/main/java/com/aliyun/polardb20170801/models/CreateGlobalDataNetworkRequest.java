// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDataNetworkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mygdn</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("DestinationFileSystemPath")
    public String destinationFileSystemPath;

    /**
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("DestinationId")
    public String destinationId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <strong>example:</strong>
     * <p>pfs</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FreezeSourceDuringSync")
    public String freezeSourceDuringSync;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("SourceFileSystemPath")
    public String sourceFileSystemPath;

    /**
     * <strong>example:</strong>
     * <p>oss-xxx</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <strong>example:</strong>
     * <p>oss</p>
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
