// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Provider extends TeaModel {
    @NameInMap("company")
    public String company;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("contact")
    public String contact;

    @NameInMap("email")
    public String email;

    @NameInMap("team")
    public String team;

    @NameInMap("teamId")
    public Long teamId;

    public static Provider build(java.util.Map<String, ?> map) throws Exception {
        Provider self = new Provider();
        return TeaModel.build(map, self);
    }

    public Provider setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public Provider setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public Provider setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public Provider setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Provider setTeam(String team) {
        this.team = team;
        return this;
    }
    public String getTeam() {
        return this.team;
    }

    public Provider setTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    public Long getTeamId() {
        return this.teamId;
    }

}
