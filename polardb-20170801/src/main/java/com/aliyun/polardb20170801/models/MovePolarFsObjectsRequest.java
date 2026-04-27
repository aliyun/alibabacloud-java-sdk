// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class MovePolarFsObjectsRequest extends TeaModel {
    @NameInMap("ObjectsToMove")
    public java.util.List<MovePolarFsObjectsRequestObjectsToMove> objectsToMove;

    /**
     * <strong>example:</strong>
     * <p>pfs-test*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static MovePolarFsObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        MovePolarFsObjectsRequest self = new MovePolarFsObjectsRequest();
        return TeaModel.build(map, self);
    }

    public MovePolarFsObjectsRequest setObjectsToMove(java.util.List<MovePolarFsObjectsRequestObjectsToMove> objectsToMove) {
        this.objectsToMove = objectsToMove;
        return this;
    }
    public java.util.List<MovePolarFsObjectsRequestObjectsToMove> getObjectsToMove() {
        return this.objectsToMove;
    }

    public MovePolarFsObjectsRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static class MovePolarFsObjectsRequestObjectsToMove extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/test1</p>
         */
        @NameInMap("DestinationPath")
        public String destinationPath;

        /**
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("SourcePath")
        public String sourcePath;

        public static MovePolarFsObjectsRequestObjectsToMove build(java.util.Map<String, ?> map) throws Exception {
            MovePolarFsObjectsRequestObjectsToMove self = new MovePolarFsObjectsRequestObjectsToMove();
            return TeaModel.build(map, self);
        }

        public MovePolarFsObjectsRequestObjectsToMove setDestinationPath(String destinationPath) {
            this.destinationPath = destinationPath;
            return this;
        }
        public String getDestinationPath() {
            return this.destinationPath;
        }

        public MovePolarFsObjectsRequestObjectsToMove setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

    }

}
