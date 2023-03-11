// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckCustomConfigRequest extends TeaModel {
    @NameInMap("CheckId")
    public Long checkId;

    @NameInMap("CustomConfigs")
    public java.util.List<ChangeCheckCustomConfigRequestCustomConfigs> customConfigs;

    @NameInMap("RegionId")
    public String regionId;

    public static ChangeCheckCustomConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckCustomConfigRequest self = new ChangeCheckCustomConfigRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckCustomConfigRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ChangeCheckCustomConfigRequest setCustomConfigs(java.util.List<ChangeCheckCustomConfigRequestCustomConfigs> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }
    public java.util.List<ChangeCheckCustomConfigRequestCustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    public ChangeCheckCustomConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ChangeCheckCustomConfigRequestCustomConfigs extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        public static ChangeCheckCustomConfigRequestCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckCustomConfigRequestCustomConfigs self = new ChangeCheckCustomConfigRequestCustomConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeCheckCustomConfigRequestCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChangeCheckCustomConfigRequestCustomConfigs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ChangeCheckCustomConfigRequestCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
