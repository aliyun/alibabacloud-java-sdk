// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOdpsShipperRequest extends TeaModel {
    @NameInMap("shipperName")
    public String shipperName;

    @NameInMap("targetConfiguration")
    public CreateOdpsShipperRequestTargetConfiguration targetConfiguration;

    @NameInMap("targetType")
    public String targetType;

    public static CreateOdpsShipperRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOdpsShipperRequest self = new CreateOdpsShipperRequest();
        return TeaModel.build(map, self);
    }

    public CreateOdpsShipperRequest setShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }
    public String getShipperName() {
        return this.shipperName;
    }

    public CreateOdpsShipperRequest setTargetConfiguration(CreateOdpsShipperRequestTargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }
    public CreateOdpsShipperRequestTargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    public CreateOdpsShipperRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class CreateOdpsShipperRequestTargetConfiguration extends TeaModel {
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

        public static CreateOdpsShipperRequestTargetConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateOdpsShipperRequestTargetConfiguration self = new CreateOdpsShipperRequestTargetConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateOdpsShipperRequestTargetConfiguration setBufferInterval(Integer bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Integer getBufferInterval() {
            return this.bufferInterval;
        }

        public CreateOdpsShipperRequestTargetConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateOdpsShipperRequestTargetConfiguration setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public CreateOdpsShipperRequestTargetConfiguration setOdpsEndpoint(String odpsEndpoint) {
            this.odpsEndpoint = odpsEndpoint;
            return this;
        }
        public String getOdpsEndpoint() {
            return this.odpsEndpoint;
        }

        public CreateOdpsShipperRequestTargetConfiguration setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public CreateOdpsShipperRequestTargetConfiguration setOdpsTable(String odpsTable) {
            this.odpsTable = odpsTable;
            return this;
        }
        public String getOdpsTable() {
            return this.odpsTable;
        }

        public CreateOdpsShipperRequestTargetConfiguration setPartitionColumn(java.util.List<String> partitionColumn) {
            this.partitionColumn = partitionColumn;
            return this;
        }
        public java.util.List<String> getPartitionColumn() {
            return this.partitionColumn;
        }

        public CreateOdpsShipperRequestTargetConfiguration setPartitionTimeFormat(String partitionTimeFormat) {
            this.partitionTimeFormat = partitionTimeFormat;
            return this;
        }
        public String getPartitionTimeFormat() {
            return this.partitionTimeFormat;
        }

    }

}
