// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class PersonalRightsInfoResponse extends TeaModel {
    @NameInMap("expires_time")
    public String expiresTime;

    @NameInMap("history_latest_rights")
    public PersonalRightsInfoResponse historyLatestRights;

    @NameInMap("icon")
    public String icon;

    @NameInMap("is_expires")
    public Boolean isExpires;

    @NameInMap("name")
    public String name;

    @NameInMap("other_rights")
    public PersonalRightsInfoResponse otherRights;

    @NameInMap("privileges")
    public java.util.List<DataBoxPrivileges> privileges;

    @NameInMap("spu_id")
    public String spuId;

    @NameInMap("title")
    public String title;

    public static PersonalRightsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        PersonalRightsInfoResponse self = new PersonalRightsInfoResponse();
        return TeaModel.build(map, self);
    }

    public PersonalRightsInfoResponse setExpiresTime(String expiresTime) {
        this.expiresTime = expiresTime;
        return this;
    }
    public String getExpiresTime() {
        return this.expiresTime;
    }

    public PersonalRightsInfoResponse setHistoryLatestRights(PersonalRightsInfoResponse historyLatestRights) {
        this.historyLatestRights = historyLatestRights;
        return this;
    }
    public PersonalRightsInfoResponse getHistoryLatestRights() {
        return this.historyLatestRights;
    }

    public PersonalRightsInfoResponse setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public PersonalRightsInfoResponse setIsExpires(Boolean isExpires) {
        this.isExpires = isExpires;
        return this;
    }
    public Boolean getIsExpires() {
        return this.isExpires;
    }

    public PersonalRightsInfoResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PersonalRightsInfoResponse setOtherRights(PersonalRightsInfoResponse otherRights) {
        this.otherRights = otherRights;
        return this;
    }
    public PersonalRightsInfoResponse getOtherRights() {
        return this.otherRights;
    }

    public PersonalRightsInfoResponse setPrivileges(java.util.List<DataBoxPrivileges> privileges) {
        this.privileges = privileges;
        return this;
    }
    public java.util.List<DataBoxPrivileges> getPrivileges() {
        return this.privileges;
    }

    public PersonalRightsInfoResponse setSpuId(String spuId) {
        this.spuId = spuId;
        return this;
    }
    public String getSpuId() {
        return this.spuId;
    }

    public PersonalRightsInfoResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
