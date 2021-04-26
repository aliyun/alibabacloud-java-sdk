// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ImportSpecialPersonnelRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("StoreIds")
    public String storeIds;

    @NameInMap("Urls")
    public String urls;

    @NameInMap("PersonType")
    public String personType;

    @NameInMap("UkId")
    public Long ukId;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("PersonName")
    public String personName;

    @NameInMap("Status")
    public String status;

    public static ImportSpecialPersonnelRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSpecialPersonnelRequest self = new ImportSpecialPersonnelRequest();
        return TeaModel.build(map, self);
    }

    public ImportSpecialPersonnelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportSpecialPersonnelRequest setStoreIds(String storeIds) {
        this.storeIds = storeIds;
        return this;
    }
    public String getStoreIds() {
        return this.storeIds;
    }

    public ImportSpecialPersonnelRequest setUrls(String urls) {
        this.urls = urls;
        return this;
    }
    public String getUrls() {
        return this.urls;
    }

    public ImportSpecialPersonnelRequest setPersonType(String personType) {
        this.personType = personType;
        return this;
    }
    public String getPersonType() {
        return this.personType;
    }

    public ImportSpecialPersonnelRequest setUkId(Long ukId) {
        this.ukId = ukId;
        return this;
    }
    public Long getUkId() {
        return this.ukId;
    }

    public ImportSpecialPersonnelRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public ImportSpecialPersonnelRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public ImportSpecialPersonnelRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
