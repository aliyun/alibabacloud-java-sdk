// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateVulAutoRepairConfigRequest extends TeaModel {
    /**
     * <p>The vulnerability that can be automatically fixed.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The vulnerabilities that can be automatically fixed.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The alias of the vulnerability.</p>
     */
    @NameInMap("VulAutoRepairConfigList")
    public java.util.List<CreateVulAutoRepairConfigRequestVulAutoRepairConfigList> vulAutoRepairConfigList;

    public static CreateVulAutoRepairConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVulAutoRepairConfigRequest self = new CreateVulAutoRepairConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateVulAutoRepairConfigRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateVulAutoRepairConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateVulAutoRepairConfigRequest setVulAutoRepairConfigList(java.util.List<CreateVulAutoRepairConfigRequestVulAutoRepairConfigList> vulAutoRepairConfigList) {
        this.vulAutoRepairConfigList = vulAutoRepairConfigList;
        return this;
    }
    public java.util.List<CreateVulAutoRepairConfigRequestVulAutoRepairConfigList> getVulAutoRepairConfigList() {
        return this.vulAutoRepairConfigList;
    }

    public static class CreateVulAutoRepairConfigRequestVulAutoRepairConfigList extends TeaModel {
        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateVulAutoRepairConfigRequestVulAutoRepairConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateVulAutoRepairConfigRequestVulAutoRepairConfigList self = new CreateVulAutoRepairConfigRequestVulAutoRepairConfigList();
            return TeaModel.build(map, self);
        }

        public CreateVulAutoRepairConfigRequestVulAutoRepairConfigList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreateVulAutoRepairConfigRequestVulAutoRepairConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
