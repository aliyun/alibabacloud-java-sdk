// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeEnvResourceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("EnvResource")
    public DescribeEnvResourceResponseBodyEnvResource envResource;

    public static DescribeEnvResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvResourceResponseBody self = new DescribeEnvResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnvResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnvResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnvResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEnvResourceResponseBody setEnvResource(DescribeEnvResourceResponseBodyEnvResource envResource) {
        this.envResource = envResource;
        return this;
    }
    public DescribeEnvResourceResponseBodyEnvResource getEnvResource() {
        return this.envResource;
    }

    public static class DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch self = new DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch> vSwitch;

        public static DescribeEnvResourceResponseBodyEnvResourceVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceVSwitches self = new DescribeEnvResourceResponseBodyEnvResourceVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceVSwitches setVSwitch(java.util.List<DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch> vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceVSwitchesVSwitch> getVSwitch() {
            return this.vSwitch;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceVpc extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DescribeEnvResourceResponseBodyEnvResourceVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceVpc self = new DescribeEnvResourceResponseBodyEnvResourceVpc();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceVpc setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceMonitorGroup extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DescribeEnvResourceResponseBodyEnvResourceMonitorGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceMonitorGroup self = new DescribeEnvResourceResponseBodyEnvResourceMonitorGroup();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceMonitorGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener self = new DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners extends TeaModel {
        @NameInMap("Listener")
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener> listener;

        public static DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners self = new DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners setListener(java.util.List<DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener> listener) {
            this.listener = listener;
            return this;
        }
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListenersListener> getListener() {
            return this.listener;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer extends TeaModel {
        @NameInMap("Imported")
        public Boolean imported;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("Listeners")
        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners listeners;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Id")
        public String id;

        public static DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer self = new DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer setListeners(DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners listeners) {
            this.listeners = listeners;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancerListeners getListeners() {
            return this.listeners;
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceLoadBalancers extends TeaModel {
        @NameInMap("LoadBalancer")
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer> loadBalancer;

        public static DescribeEnvResourceResponseBodyEnvResourceLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceLoadBalancers self = new DescribeEnvResourceResponseBodyEnvResourceLoadBalancers();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancers setLoadBalancer(java.util.List<DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceLoadBalancersLoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceInstancesInstance extends TeaModel {
        @NameInMap("Imported")
        public Boolean imported;

        @NameInMap("Id")
        public String id;

        public static DescribeEnvResourceResponseBodyEnvResourceInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceInstancesInstance self = new DescribeEnvResourceResponseBodyEnvResourceInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceInstancesInstance setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public DescribeEnvResourceResponseBodyEnvResourceInstancesInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceInstancesInstance> instance;

        public static DescribeEnvResourceResponseBodyEnvResourceInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceInstances self = new DescribeEnvResourceResponseBodyEnvResourceInstances();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceInstances setInstance(java.util.List<DescribeEnvResourceResponseBodyEnvResourceInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceInstancesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup self = new DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup> securityGroup;

        public static DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups self = new DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups setSecurityGroup(java.util.List<DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroupsSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceScalingGroup extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DescribeEnvResourceResponseBodyEnvResourceScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceScalingGroup self = new DescribeEnvResourceResponseBodyEnvResourceScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceScalingGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceDomainsDomain extends TeaModel {
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("HostedBy")
        public String hostedBy;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ManagedBy")
        public String managedBy;

        public static DescribeEnvResourceResponseBodyEnvResourceDomainsDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceDomainsDomain self = new DescribeEnvResourceResponseBodyEnvResourceDomainsDomain();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceDomainsDomain setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeEnvResourceResponseBodyEnvResourceDomainsDomain setHostedBy(String hostedBy) {
            this.hostedBy = hostedBy;
            return this;
        }
        public String getHostedBy() {
            return this.hostedBy;
        }

        public DescribeEnvResourceResponseBodyEnvResourceDomainsDomain setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeEnvResourceResponseBodyEnvResourceDomainsDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeEnvResourceResponseBodyEnvResourceDomainsDomain setManagedBy(String managedBy) {
            this.managedBy = managedBy;
            return this;
        }
        public String getManagedBy() {
            return this.managedBy;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceDomains extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceDomainsDomain> domain;

        public static DescribeEnvResourceResponseBodyEnvResourceDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceDomains self = new DescribeEnvResourceResponseBodyEnvResourceDomains();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceDomains setDomain(java.util.List<DescribeEnvResourceResponseBodyEnvResourceDomainsDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceDomainsDomain> getDomain() {
            return this.domain;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance extends TeaModel {
        @NameInMap("Imported")
        public Boolean imported;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Id")
        public String id;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance self = new DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResourceRdsInstances extends TeaModel {
        @NameInMap("RdsInstance")
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance> rdsInstance;

        public static DescribeEnvResourceResponseBodyEnvResourceRdsInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResourceRdsInstances self = new DescribeEnvResourceResponseBodyEnvResourceRdsInstances();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResourceRdsInstances setRdsInstance(java.util.List<DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance> rdsInstance) {
            this.rdsInstance = rdsInstance;
            return this;
        }
        public java.util.List<DescribeEnvResourceResponseBodyEnvResourceRdsInstancesRdsInstance> getRdsInstance() {
            return this.rdsInstance;
        }

    }

    public static class DescribeEnvResourceResponseBodyEnvResource extends TeaModel {
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("VSwitches")
        public DescribeEnvResourceResponseBodyEnvResourceVSwitches vSwitches;

        @NameInMap("Vpc")
        public DescribeEnvResourceResponseBodyEnvResourceVpc vpc;

        @NameInMap("MonitorGroup")
        public DescribeEnvResourceResponseBodyEnvResourceMonitorGroup monitorGroup;

        @NameInMap("LaunchConfigurationId")
        public String launchConfigurationId;

        @NameInMap("LoadBalancers")
        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancers loadBalancers;

        @NameInMap("Instances")
        public DescribeEnvResourceResponseBodyEnvResourceInstances instances;

        @NameInMap("DefaultSecurityGroups")
        public DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups defaultSecurityGroups;

        @NameInMap("ScalingGroup")
        public DescribeEnvResourceResponseBodyEnvResourceScalingGroup scalingGroup;

        @NameInMap("Domains")
        public DescribeEnvResourceResponseBodyEnvResourceDomains domains;

        @NameInMap("RdsInstances")
        public DescribeEnvResourceResponseBodyEnvResourceRdsInstances rdsInstances;

        @NameInMap("EnvId")
        public String envId;

        public static DescribeEnvResourceResponseBodyEnvResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvResourceResponseBodyEnvResource self = new DescribeEnvResourceResponseBodyEnvResource();
            return TeaModel.build(map, self);
        }

        public DescribeEnvResourceResponseBodyEnvResource setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeEnvResourceResponseBodyEnvResource setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public DescribeEnvResourceResponseBodyEnvResource setVSwitches(DescribeEnvResourceResponseBodyEnvResourceVSwitches vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceVSwitches getVSwitches() {
            return this.vSwitches;
        }

        public DescribeEnvResourceResponseBodyEnvResource setVpc(DescribeEnvResourceResponseBodyEnvResourceVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceVpc getVpc() {
            return this.vpc;
        }

        public DescribeEnvResourceResponseBodyEnvResource setMonitorGroup(DescribeEnvResourceResponseBodyEnvResourceMonitorGroup monitorGroup) {
            this.monitorGroup = monitorGroup;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceMonitorGroup getMonitorGroup() {
            return this.monitorGroup;
        }

        public DescribeEnvResourceResponseBodyEnvResource setLaunchConfigurationId(String launchConfigurationId) {
            this.launchConfigurationId = launchConfigurationId;
            return this;
        }
        public String getLaunchConfigurationId() {
            return this.launchConfigurationId;
        }

        public DescribeEnvResourceResponseBodyEnvResource setLoadBalancers(DescribeEnvResourceResponseBodyEnvResourceLoadBalancers loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceLoadBalancers getLoadBalancers() {
            return this.loadBalancers;
        }

        public DescribeEnvResourceResponseBodyEnvResource setInstances(DescribeEnvResourceResponseBodyEnvResourceInstances instances) {
            this.instances = instances;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceInstances getInstances() {
            return this.instances;
        }

        public DescribeEnvResourceResponseBodyEnvResource setDefaultSecurityGroups(DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups defaultSecurityGroups) {
            this.defaultSecurityGroups = defaultSecurityGroups;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceDefaultSecurityGroups getDefaultSecurityGroups() {
            return this.defaultSecurityGroups;
        }

        public DescribeEnvResourceResponseBodyEnvResource setScalingGroup(DescribeEnvResourceResponseBodyEnvResourceScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceScalingGroup getScalingGroup() {
            return this.scalingGroup;
        }

        public DescribeEnvResourceResponseBodyEnvResource setDomains(DescribeEnvResourceResponseBodyEnvResourceDomains domains) {
            this.domains = domains;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceDomains getDomains() {
            return this.domains;
        }

        public DescribeEnvResourceResponseBodyEnvResource setRdsInstances(DescribeEnvResourceResponseBodyEnvResourceRdsInstances rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public DescribeEnvResourceResponseBodyEnvResourceRdsInstances getRdsInstances() {
            return this.rdsInstances;
        }

        public DescribeEnvResourceResponseBodyEnvResource setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
