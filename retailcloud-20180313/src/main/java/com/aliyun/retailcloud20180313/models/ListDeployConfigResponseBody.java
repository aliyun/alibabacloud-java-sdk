// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListDeployConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListDeployConfigResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDeployConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployConfigResponseBody self = new ListDeployConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeployConfigResponseBody setData(java.util.List<ListDeployConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeployConfigResponseBodyData> getData() {
        return this.data;
    }

    public ListDeployConfigResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDeployConfigResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeployConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeployConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeployConfigResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeployConfigResponseBodyDataContainerCodePath extends TeaModel {
        @NameInMap("CodePath")
        public String codePath;

        public static ListDeployConfigResponseBodyDataContainerCodePath build(java.util.Map<String, ?> map) throws Exception {
            ListDeployConfigResponseBodyDataContainerCodePath self = new ListDeployConfigResponseBodyDataContainerCodePath();
            return TeaModel.build(map, self);
        }

        public ListDeployConfigResponseBodyDataContainerCodePath setCodePath(String codePath) {
            this.codePath = codePath;
            return this;
        }
        public String getCodePath() {
            return this.codePath;
        }

    }

    public static class ListDeployConfigResponseBodyDataContainerYamlConf extends TeaModel {
        @NameInMap("ConfigMap")
        public String configMap;

        @NameInMap("ConfigMapList")
        public java.util.List<String> configMapList;

        @NameInMap("CronJob")
        public String cronJob;

        @NameInMap("Deployment")
        public String deployment;

        @NameInMap("SecretList")
        public java.util.List<String> secretList;

        @NameInMap("StatefulSet")
        public String statefulSet;

        public static ListDeployConfigResponseBodyDataContainerYamlConf build(java.util.Map<String, ?> map) throws Exception {
            ListDeployConfigResponseBodyDataContainerYamlConf self = new ListDeployConfigResponseBodyDataContainerYamlConf();
            return TeaModel.build(map, self);
        }

        public ListDeployConfigResponseBodyDataContainerYamlConf setConfigMap(String configMap) {
            this.configMap = configMap;
            return this;
        }
        public String getConfigMap() {
            return this.configMap;
        }

        public ListDeployConfigResponseBodyDataContainerYamlConf setConfigMapList(java.util.List<String> configMapList) {
            this.configMapList = configMapList;
            return this;
        }
        public java.util.List<String> getConfigMapList() {
            return this.configMapList;
        }

        public ListDeployConfigResponseBodyDataContainerYamlConf setCronJob(String cronJob) {
            this.cronJob = cronJob;
            return this;
        }
        public String getCronJob() {
            return this.cronJob;
        }

        public ListDeployConfigResponseBodyDataContainerYamlConf setDeployment(String deployment) {
            this.deployment = deployment;
            return this;
        }
        public String getDeployment() {
            return this.deployment;
        }

        public ListDeployConfigResponseBodyDataContainerYamlConf setSecretList(java.util.List<String> secretList) {
            this.secretList = secretList;
            return this;
        }
        public java.util.List<String> getSecretList() {
            return this.secretList;
        }

        public ListDeployConfigResponseBodyDataContainerYamlConf setStatefulSet(String statefulSet) {
            this.statefulSet = statefulSet;
            return this;
        }
        public String getStatefulSet() {
            return this.statefulSet;
        }

    }

    public static class ListDeployConfigResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("ContainerCodePath")
        public ListDeployConfigResponseBodyDataContainerCodePath containerCodePath;

        @NameInMap("ContainerYamlConf")
        public ListDeployConfigResponseBodyDataContainerYamlConf containerYamlConf;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListDeployConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeployConfigResponseBodyData self = new ListDeployConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeployConfigResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListDeployConfigResponseBodyData setContainerCodePath(ListDeployConfigResponseBodyDataContainerCodePath containerCodePath) {
            this.containerCodePath = containerCodePath;
            return this;
        }
        public ListDeployConfigResponseBodyDataContainerCodePath getContainerCodePath() {
            return this.containerCodePath;
        }

        public ListDeployConfigResponseBodyData setContainerYamlConf(ListDeployConfigResponseBodyDataContainerYamlConf containerYamlConf) {
            this.containerYamlConf = containerYamlConf;
            return this;
        }
        public ListDeployConfigResponseBodyDataContainerYamlConf getContainerYamlConf() {
            return this.containerYamlConf;
        }

        public ListDeployConfigResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDeployConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDeployConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
