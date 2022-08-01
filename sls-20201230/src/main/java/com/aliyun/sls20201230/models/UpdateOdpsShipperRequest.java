// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOdpsShipperRequest extends TeaModel {
    @NameInMap("shipperName")
    public String shipperName;

    @NameInMap("targetConfiguration")
    public UpdateOdpsShipperRequestTargetConfiguration targetConfiguration;

    @NameInMap("targetType")
    public String targetType;

    public static UpdateOdpsShipperRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOdpsShipperRequest self = new UpdateOdpsShipperRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOdpsShipperRequest setShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }
    public String getShipperName() {
        return this.shipperName;
    }

    public UpdateOdpsShipperRequest setTargetConfiguration(UpdateOdpsShipperRequestTargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }
    public UpdateOdpsShipperRequestTargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    public UpdateOdpsShipperRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class UpdateOdpsShipperRequestTargetConfiguration extends TeaModel {
        @NameInMap("bufferInterval")
        public Integer bufferInterval;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("fields")
        public java.util.List<String> fields;

        @NameInMap("odpsEndpoint")
        public String odpsEndpoint;

        @NameInMap("odpsProject")
        public String odpsProject;

        @NameInMap("odpsTable")
        public String odpsTable;

        @NameInMap("partitionColumn")
        public java.util.List<String> partitionColumn;

        @NameInMap("partitionTimeFormat")
        public String partitionTimeFormat;

        public static UpdateOdpsShipperRequestTargetConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateOdpsShipperRequestTargetConfiguration self = new UpdateOdpsShipperRequestTargetConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateOdpsShipperRequestTargetConfiguration setBufferInterval(Integer bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Integer getBufferInterval() {
            return this.bufferInterval;
        }

        public UpdateOdpsShipperRequestTargetConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateOdpsShipperRequestTargetConfiguration setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public UpdateOdpsShipperRequestTargetConfiguration setOdpsEndpoint(String odpsEndpoint) {
            this.odpsEndpoint = odpsEndpoint;
            return this;
        }
        public String getOdpsEndpoint() {
            return this.odpsEndpoint;
        }

        public UpdateOdpsShipperRequestTargetConfiguration setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public UpdateOdpsShipperRequestTargetConfiguration setOdpsTable(String odpsTable) {
            this.odpsTable = odpsTable;
            return this;
        }
        public String getOdpsTable() {
            return this.odpsTable;
        }

        public UpdateOdpsShipperRequestTargetConfiguration setPartitionColumn(java.util.List<String> partitionColumn) {
            this.partitionColumn = partitionColumn;
            return this;
        }
        public java.util.List<String> getPartitionColumn() {
            return this.partitionColumn;
        }

        public UpdateOdpsShipperRequestTargetConfiguration setPartitionTimeFormat(String partitionTimeFormat) {
            this.partitionTimeFormat = partitionTimeFormat;
            return this;
        }
        public String getPartitionTimeFormat() {
            return this.partitionTimeFormat;
        }

    }

}
