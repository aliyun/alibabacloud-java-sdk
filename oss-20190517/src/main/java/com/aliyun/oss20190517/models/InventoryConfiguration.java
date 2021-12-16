// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InventoryConfiguration extends TeaModel {
    @NameInMap("Destination")
    public InventoryDestination destination;

    @NameInMap("Filter")
    public InventoryFilter filter;

    // The specified inventory list name, which must be globally unique in the bucket
    @NameInMap("Id")
    public String id;

    @NameInMap("IncludedObjectVersions")
    public String includedObjectVersions;

    // Indicates whether the inventory function is enabled
    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    // The container that stores the configuration fields included in the inventory list
    @NameInMap("OptionalFields")
    public InventoryConfigurationOptionalFields optionalFields;

    @NameInMap("Schedule")
    public InventorySchedule schedule;

    public static InventoryConfiguration build(java.util.Map<String, ?> map) throws Exception {
        InventoryConfiguration self = new InventoryConfiguration();
        return TeaModel.build(map, self);
    }

    public InventoryConfiguration setDestination(InventoryDestination destination) {
        this.destination = destination;
        return this;
    }
    public InventoryDestination getDestination() {
        return this.destination;
    }

    public InventoryConfiguration setFilter(InventoryFilter filter) {
        this.filter = filter;
        return this;
    }
    public InventoryFilter getFilter() {
        return this.filter;
    }

    public InventoryConfiguration setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InventoryConfiguration setIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
        return this;
    }
    public String getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }

    public InventoryConfiguration setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public InventoryConfiguration setOptionalFields(InventoryConfigurationOptionalFields optionalFields) {
        this.optionalFields = optionalFields;
        return this;
    }
    public InventoryConfigurationOptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    public InventoryConfiguration setSchedule(InventorySchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public InventorySchedule getSchedule() {
        return this.schedule;
    }

    public static class InventoryConfigurationOptionalFields extends TeaModel {
        // field list
        @NameInMap("Field")
        public java.util.List<String> fields;

        public static InventoryConfigurationOptionalFields build(java.util.Map<String, ?> map) throws Exception {
            InventoryConfigurationOptionalFields self = new InventoryConfigurationOptionalFields();
            return TeaModel.build(map, self);
        }

        public InventoryConfigurationOptionalFields setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

    }

}
