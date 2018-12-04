package com.fmi110..dao.model;

import java.io.Serializable;
import java.util.Date;

public class AnjProject implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 发起人
     *
     * @mbg.generated
     */
    private String initiator;

    /**
     * 发起人logo图片的链接
     *
     * @mbg.generated
     */
    private String initiatorLogo;

    /**
     * 项目标题
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 项目的简单描述
     *
     * @mbg.generated
     */
    private String pjtBreif;

    /**
     * 项目类型:公寓 酒店 民宿 共享办公 休闲娱乐 新零售 医疗健康 亲子 其他 
     *
     * @mbg.generated
     */
    private String pType;

    /**
     * 投资类型:股权  收益权  消费众筹
     *
     * @mbg.generated
     */
    private String investmentType;

    /**
     * 项目状态编码
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 项目状态描述
     *
     * @mbg.generated
     */
    private String statusName;

    /**
     * 项目地址:省份
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 项目地址:城市
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 项目地址: 省份 - 城市
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 项目LOGO - 中图
     *
     * @mbg.generated
     */
    private String imageM;

    /**
     * 项目LOGO - 小图
     *
     * @mbg.generated
     */
    private String imageS;

    /**
     * 目标金额(单位分)
     *
     * @mbg.generated
     */
    private Long financingMoney;

    /**
     *  已预约金额(单位分)
     *
     * @mbg.generated
     */
    private Long upMoney;

    /**
     * 项目预约进度
     *
     * @mbg.generated
     */
    private Integer financingRate;

    private String financingType;

    /**
     * 项目认购进度 = (认购金额/目标金额*100)
     *
     * @mbg.generated
     */
    private Integer investFinancingRate;

    /**
     * 已认购金额(单位分)
     *
     * @mbg.generated
     */
    private Long investUpMoney;

    /**
     * 剩余时间(天),项目结束时,显示结束日期
     *
     * @mbg.generated
     */
    private Integer remainDays;

    /**
     * 项目进度,预约时状态时,与预约进度一致;认购时,与认购进度一致
     *
     * @mbg.generated
     */
    private Integer projectProgress;

    /**
     * 预告开始时间
     *
     * @mbg.generated
     */
    private Date preheatdateStart;

    /**
     * 预告结束时间
     *
     * @mbg.generated
     */
    private Date preheatdateEnd;

    /**
     * 预约开始时间
     *
     * @mbg.generated
     */
    private Date startDate;

    /**
     * 预约结束时间
     *
     * @mbg.generated
     */
    private Date endDate;

    /**
     * 认购开始时间
     *
     * @mbg.generated
     */
    private Date investStartDate;

    /**
     * 认购结束时间
     *
     * @mbg.generated
     */
    private Date inverstEndDate;

    /**
     * 项目完成时间 
     *
     * @mbg.generated
     */
    private Date finishDate;

    private String raise;

    private String launch;

    /**
     * 排序权重字段1
     *
     * @mbg.generated
     */
    private Integer sortA;

    /**
     * 排序权重字段2
     *
     * @mbg.generated
     */
    private Integer sortB;

    /**
     * 创建者
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 更新者
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 删除标志
     *
     * @mbg.generated
     */
    private String deleted;

    /**
     * 商品上架状态,默认 0=下架
     *
     * @mbg.generated
     */
    private String isOnSale;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getInitiatorLogo() {
        return initiatorLogo;
    }

    public void setInitiatorLogo(String initiatorLogo) {
        this.initiatorLogo = initiatorLogo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPjtBreif() {
        return pjtBreif;
    }

    public void setPjtBreif(String pjtBreif) {
        this.pjtBreif = pjtBreif;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageM() {
        return imageM;
    }

    public void setImageM(String imageM) {
        this.imageM = imageM;
    }

    public String getImageS() {
        return imageS;
    }

    public void setImageS(String imageS) {
        this.imageS = imageS;
    }

    public Long getFinancingMoney() {
        return financingMoney;
    }

    public void setFinancingMoney(Long financingMoney) {
        this.financingMoney = financingMoney;
    }

    public Long getUpMoney() {
        return upMoney;
    }

    public void setUpMoney(Long upMoney) {
        this.upMoney = upMoney;
    }

    public Integer getFinancingRate() {
        return financingRate;
    }

    public void setFinancingRate(Integer financingRate) {
        this.financingRate = financingRate;
    }

    public String getFinancingType() {
        return financingType;
    }

    public void setFinancingType(String financingType) {
        this.financingType = financingType;
    }

    public Integer getInvestFinancingRate() {
        return investFinancingRate;
    }

    public void setInvestFinancingRate(Integer investFinancingRate) {
        this.investFinancingRate = investFinancingRate;
    }

    public Long getInvestUpMoney() {
        return investUpMoney;
    }

    public void setInvestUpMoney(Long investUpMoney) {
        this.investUpMoney = investUpMoney;
    }

    public Integer getRemainDays() {
        return remainDays;
    }

    public void setRemainDays(Integer remainDays) {
        this.remainDays = remainDays;
    }

    public Integer getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(Integer projectProgress) {
        this.projectProgress = projectProgress;
    }

    public Date getPreheatdateStart() {
        return preheatdateStart;
    }

    public void setPreheatdateStart(Date preheatdateStart) {
        this.preheatdateStart = preheatdateStart;
    }

    public Date getPreheatdateEnd() {
        return preheatdateEnd;
    }

    public void setPreheatdateEnd(Date preheatdateEnd) {
        this.preheatdateEnd = preheatdateEnd;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getInvestStartDate() {
        return investStartDate;
    }

    public void setInvestStartDate(Date investStartDate) {
        this.investStartDate = investStartDate;
    }

    public Date getInverstEndDate() {
        return inverstEndDate;
    }

    public void setInverstEndDate(Date inverstEndDate) {
        this.inverstEndDate = inverstEndDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getRaise() {
        return raise;
    }

    public void setRaise(String raise) {
        this.raise = raise;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public Integer getSortA() {
        return sortA;
    }

    public void setSortA(Integer sortA) {
        this.sortA = sortA;
    }

    public Integer getSortB() {
        return sortB;
    }

    public void setSortB(Integer sortB) {
        this.sortB = sortB;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", initiator=").append(initiator);
        sb.append(", initiatorLogo=").append(initiatorLogo);
        sb.append(", title=").append(title);
        sb.append(", pjtBreif=").append(pjtBreif);
        sb.append(", pType=").append(pType);
        sb.append(", investmentType=").append(investmentType);
        sb.append(", status=").append(status);
        sb.append(", statusName=").append(statusName);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", imageM=").append(imageM);
        sb.append(", imageS=").append(imageS);
        sb.append(", financingMoney=").append(financingMoney);
        sb.append(", upMoney=").append(upMoney);
        sb.append(", financingRate=").append(financingRate);
        sb.append(", financingType=").append(financingType);
        sb.append(", investFinancingRate=").append(investFinancingRate);
        sb.append(", investUpMoney=").append(investUpMoney);
        sb.append(", remainDays=").append(remainDays);
        sb.append(", projectProgress=").append(projectProgress);
        sb.append(", preheatdateStart=").append(preheatdateStart);
        sb.append(", preheatdateEnd=").append(preheatdateEnd);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", investStartDate=").append(investStartDate);
        sb.append(", inverstEndDate=").append(inverstEndDate);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", raise=").append(raise);
        sb.append(", launch=").append(launch);
        sb.append(", sortA=").append(sortA);
        sb.append(", sortB=").append(sortB);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", deleted=").append(deleted);
        sb.append(", isOnSale=").append(isOnSale);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AnjProject other = (AnjProject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInitiator() == null ? other.getInitiator() == null : this.getInitiator().equals(other.getInitiator()))
            && (this.getInitiatorLogo() == null ? other.getInitiatorLogo() == null : this.getInitiatorLogo().equals(other.getInitiatorLogo()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getPjtBreif() == null ? other.getPjtBreif() == null : this.getPjtBreif().equals(other.getPjtBreif()))
            && (this.getpType() == null ? other.getpType() == null : this.getpType().equals(other.getpType()))
            && (this.getInvestmentType() == null ? other.getInvestmentType() == null : this.getInvestmentType().equals(other.getInvestmentType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStatusName() == null ? other.getStatusName() == null : this.getStatusName().equals(other.getStatusName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getImageM() == null ? other.getImageM() == null : this.getImageM().equals(other.getImageM()))
            && (this.getImageS() == null ? other.getImageS() == null : this.getImageS().equals(other.getImageS()))
            && (this.getFinancingMoney() == null ? other.getFinancingMoney() == null : this.getFinancingMoney().equals(other.getFinancingMoney()))
            && (this.getUpMoney() == null ? other.getUpMoney() == null : this.getUpMoney().equals(other.getUpMoney()))
            && (this.getFinancingRate() == null ? other.getFinancingRate() == null : this.getFinancingRate().equals(other.getFinancingRate()))
            && (this.getFinancingType() == null ? other.getFinancingType() == null : this.getFinancingType().equals(other.getFinancingType()))
            && (this.getInvestFinancingRate() == null ? other.getInvestFinancingRate() == null : this.getInvestFinancingRate().equals(other.getInvestFinancingRate()))
            && (this.getInvestUpMoney() == null ? other.getInvestUpMoney() == null : this.getInvestUpMoney().equals(other.getInvestUpMoney()))
            && (this.getRemainDays() == null ? other.getRemainDays() == null : this.getRemainDays().equals(other.getRemainDays()))
            && (this.getProjectProgress() == null ? other.getProjectProgress() == null : this.getProjectProgress().equals(other.getProjectProgress()))
            && (this.getPreheatdateStart() == null ? other.getPreheatdateStart() == null : this.getPreheatdateStart().equals(other.getPreheatdateStart()))
            && (this.getPreheatdateEnd() == null ? other.getPreheatdateEnd() == null : this.getPreheatdateEnd().equals(other.getPreheatdateEnd()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getInvestStartDate() == null ? other.getInvestStartDate() == null : this.getInvestStartDate().equals(other.getInvestStartDate()))
            && (this.getInverstEndDate() == null ? other.getInverstEndDate() == null : this.getInverstEndDate().equals(other.getInverstEndDate()))
            && (this.getFinishDate() == null ? other.getFinishDate() == null : this.getFinishDate().equals(other.getFinishDate()))
            && (this.getRaise() == null ? other.getRaise() == null : this.getRaise().equals(other.getRaise()))
            && (this.getLaunch() == null ? other.getLaunch() == null : this.getLaunch().equals(other.getLaunch()))
            && (this.getSortA() == null ? other.getSortA() == null : this.getSortA().equals(other.getSortA()))
            && (this.getSortB() == null ? other.getSortB() == null : this.getSortB().equals(other.getSortB()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getIsOnSale() == null ? other.getIsOnSale() == null : this.getIsOnSale().equals(other.getIsOnSale()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInitiator() == null) ? 0 : getInitiator().hashCode());
        result = prime * result + ((getInitiatorLogo() == null) ? 0 : getInitiatorLogo().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getPjtBreif() == null) ? 0 : getPjtBreif().hashCode());
        result = prime * result + ((getpType() == null) ? 0 : getpType().hashCode());
        result = prime * result + ((getInvestmentType() == null) ? 0 : getInvestmentType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStatusName() == null) ? 0 : getStatusName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getImageM() == null) ? 0 : getImageM().hashCode());
        result = prime * result + ((getImageS() == null) ? 0 : getImageS().hashCode());
        result = prime * result + ((getFinancingMoney() == null) ? 0 : getFinancingMoney().hashCode());
        result = prime * result + ((getUpMoney() == null) ? 0 : getUpMoney().hashCode());
        result = prime * result + ((getFinancingRate() == null) ? 0 : getFinancingRate().hashCode());
        result = prime * result + ((getFinancingType() == null) ? 0 : getFinancingType().hashCode());
        result = prime * result + ((getInvestFinancingRate() == null) ? 0 : getInvestFinancingRate().hashCode());
        result = prime * result + ((getInvestUpMoney() == null) ? 0 : getInvestUpMoney().hashCode());
        result = prime * result + ((getRemainDays() == null) ? 0 : getRemainDays().hashCode());
        result = prime * result + ((getProjectProgress() == null) ? 0 : getProjectProgress().hashCode());
        result = prime * result + ((getPreheatdateStart() == null) ? 0 : getPreheatdateStart().hashCode());
        result = prime * result + ((getPreheatdateEnd() == null) ? 0 : getPreheatdateEnd().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getInvestStartDate() == null) ? 0 : getInvestStartDate().hashCode());
        result = prime * result + ((getInverstEndDate() == null) ? 0 : getInverstEndDate().hashCode());
        result = prime * result + ((getFinishDate() == null) ? 0 : getFinishDate().hashCode());
        result = prime * result + ((getRaise() == null) ? 0 : getRaise().hashCode());
        result = prime * result + ((getLaunch() == null) ? 0 : getLaunch().hashCode());
        result = prime * result + ((getSortA() == null) ? 0 : getSortA().hashCode());
        result = prime * result + ((getSortB() == null) ? 0 : getSortB().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getIsOnSale() == null) ? 0 : getIsOnSale().hashCode());
        return result;
    }
}