// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpHistoryConfig extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("accountName")
    public String accountName;

    @NameInMap("askId")
    public String askId;

    @NameInMap("configId")
    public Long configId;

    @NameInMap("context")
    public String context;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("env")
    public String env;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("type")
    public String type;

    public static PdpHistoryConfig build(java.util.Map<String, ?> map) throws Exception {
        PdpHistoryConfig self = new PdpHistoryConfig();
        return TeaModel.build(map, self);
    }

    public PdpHistoryConfig setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PdpHistoryConfig setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public PdpHistoryConfig setAskId(String askId) {
        this.askId = askId;
        return this;
    }
    public String getAskId() {
        return this.askId;
    }

    public PdpHistoryConfig setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public PdpHistoryConfig setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public PdpHistoryConfig setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public PdpHistoryConfig setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpHistoryConfig setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PdpHistoryConfig setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpHistoryConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpHistoryConfig setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PdpHistoryConfig setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpHistoryConfig setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public PdpHistoryConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
